const { createProxyMiddleware } = require('http-proxy-middleware');
const cors = require('cors');
module.exports = function(app) {
    app.use(cors(
        '/api',
        createProxyMiddleware({
            target: 'http://localhost:3000',
            changeOrigin: true,

        })
    ));
};