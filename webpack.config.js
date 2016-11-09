module.exports = {
//  context: __dirname + "js",
// entry: "js/app.js",
  output: {
    filename: "bundle.js",
    path: __dirname + 'src/main/resources/static/dist',
  },


  module: {
    loaders: [
      {
        test: /\.js?$/,
        exclude: /node_modules/,
        loaders: ["babel-loader","jsx-loader?insertPragma=React.DOM&harmony"],
      },
      { test: /\.css$/, loader: "style-loader!css-loader" },

    ],
  }

}