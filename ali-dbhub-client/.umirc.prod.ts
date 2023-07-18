import { defineConfig } from 'umi';
const MonacoWebpackPlugin = require('monaco-editor-webpack-plugin');
const UMI_PublicPath = process.env.UMI_PublicPath || '/static/front/';

const chainWebpack = (config: any, { webpack }: any) => {
  config.plugin('monaco-editor').use(MonacoWebpackPlugin, [
    {
      languages: ['mysql', 'pgsql', 'sql'],
    },
  ]);

  config.plugin('define').use(require('webpack').DefinePlugin, [{
    __BUILD_TIME__: JSON.stringify(formatDate(new Date(),'yyyyMMddhhmmss')),
    __APP_VERSION__: JSON.stringify(process.env.APP_VERSION || '0.0.0'),
  }]);
  
  // new RuntimePublicPathPlugin({
  //   publicPath: `${window.assetsRoot}`,
  // })
  // config.output.publicPath(assetDir);

  // config.output
  // .filename('[name].js')
  // .chunkFilename('[name].chunk.js')
  // .publicPath(assetDir)
  // // 修改css输出目录
  // config.plugin("extract-css").tap(() => [
  //   {
  //     filename: '[name].css',
  //     chunkFilename: `[name].chunk.css`,
  //     ignoreOrder: true,
  //     publicPath: assetDir
  //   },
  // ]);
};

export default defineConfig({
  publicPath: UMI_PublicPath,
  chainWebpack
});

function formatDate(date:any, fmt = 'yyyy-MM-dd') {
  if (!date) {
    return '';
  }
  if (typeof date == 'number' || typeof date == 'string') {
    date = new Date(date);
  }
  if (!(date instanceof Date) || isNaN(date.getTime())) {
    return '';
  }
  var o:any = {
    'M+': date.getMonth() + 1,
    'd+': date.getDate(),
    'h+': date.getHours(),
    'm+': date.getMinutes(),
    's+': date.getSeconds(),
    'q+': Math.floor((date.getMonth() + 3) / 3),
    S: date.getMilliseconds(),
  };
  if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));
  for (var k  in o)
    if (new RegExp('(' + k + ')').test(fmt))
      fmt = fmt.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ('00' + o[k]).substr(('' + o[k]).length));
  return fmt;
}
