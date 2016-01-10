'use strict';

module.exports = function (files) {
  files.forEach(function (file) {
    if (file.error) {
      process.exit(1);
    }
  });
};
