const proxy = [
    {
        context: '/api/tutor',
        target: 'http://localhost:8082',
        pathRewrite: {'^/api/tutor' : ''}
    },
    {
        context: '/api',
        target: 'http://localhost:8081',
        pathRewrite: {'^/api/' : ''}
    }
  ];
module.exports = proxy;