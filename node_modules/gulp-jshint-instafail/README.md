# gulp-jshint-instafail

Instantly failing reporter for gulp-jshint.

## Purpose

Stop gulp and jshint from whatever it is doing, once jshint reported an error
in a file.

## Installation

```
npm install gulp-jshint-instafail
```

## Usage

```js
gulp.task("lint", function () {
  gulp
    .src(["./lib/**/*.js"])
    .pipe(jshint())
    .pipe(jshint.reporter(require("jshint-stylish")))
    .pipe(jshint.reporter(require("gulp-jshint-instafail")));
});
```
