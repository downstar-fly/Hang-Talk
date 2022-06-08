const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  pages: {
    app: {
      entry: 'src/main.ts',
      template: 'public/index.html',
      filename: 'index.html',
      chunks: ['app', 'vendors'],
    },
  },
  transpileDependencies: true,
  devServer: {},
  css: {
    loaderOptions: {
      css: {},
      less: {},
    },
  },
});
