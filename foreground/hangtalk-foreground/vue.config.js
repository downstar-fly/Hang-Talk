const resolve = require('path');
const env = require('./build/config');

module.exports = {
  pages: {
    app: {
      entry: 'src/main.ts',
      template: 'public/index.html',
      filename: 'index.html',
      chunks: ['app', 'vendors'],
    },
  },
  devServer: {
    hot: true,
    port: env.port,
    proxy: {
      '/': {
        target: env.proxyApi,
        credentials: false,
        secure: false,
        changeOrigin: true,
      },
    },
  },
  transpileDependencies: true,
  devServer: {},
  css: {
    loaderOptions: {
      css: {},
    },
  },
}
