package com.example.controller;

import com.example.model.entity.Location;
import com.example.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class LocationController {

    @Autowired
    private LocationService LocationService;

    @RequestMapping(value = "selectList.do")
    public String selectList(@RequestParam("locationLatitude") float locationLatitude, @RequestParam("locationLongitude") float locationLongitude) {

        Location l = new Location();
        l.setLocationLatitude(locationLatitude);
        l.setLocationLongitude(locationLongitude);
        //l.setUserNo(userNo);

        int listCount = LocationService.selectListCount(l);

        // 최초 로그인 시 insert
        if(listCount == 0) {
            int result = LocationService.insertCoordinate(l);
        } else { // 기존 데이터가 있을때 update
            int result = LocationService.updateCoordinate(l);
        }

        return "redirect:/";
    }

    @RequestMapping("locationMap.lo")
    public String selectMap() {

        return "location/location";
    }

    @RequestMapping("locationMapList.lo")
    @ResponseBody
    public String selectMapList() {
        ArrayList<Location> list = LocationService.selectMapList();

        String data = "";
        for(int i=0; i<list.size(); i++) {
            if(i==0 && list.size()>0) {
                data = "{\n  \"positions\" : [\n    {\n    \"lng\": "+list.get(i).getLocationLongitude()+",\n    \"lat\": "+list.get(i).getLocationLatitude()+"\n    } ,";
            } else if(i>0 && i<list.size()-1) {
                data += " {\n    \"lng\": "+list.get(i).getLocationLongitude()+",\n    \"lat\": "+list.get(i).getLocationLatitude()+"\n    } ,";
            } else if(i==list.size()-1) {
                data += " {\n    \"lng\": "+list.get(i).getLocationLongitude()+",\n    \"lat\": "+list.get(i).getLocationLatitude()+"}\n  ]\n}";
            }
        }

        // 본인 환경에 따라 new File 부분의 경로를 수정 해주세요.
        // ex. D:\\test\\resources\\kakaoMap/kakaoMap.json
        File myFile = new File("C:\\Users\\zaniz\\IdeaProjects\\playAround\\src\\main\\resources\\static\\kakaoMap.json");
        try {
            if(myFile.exists()){
                myFile.delete();
            }
            myFile.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));
            writer.write(data);
            writer.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("예외 처리");
            System.out.println("파일을 처리하는 과정에서 오류가 발생했습니다.");
        }

        return "";
    }
}

