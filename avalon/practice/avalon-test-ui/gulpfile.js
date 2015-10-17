var gulp = require('gulp');
var connect = require('gulp-connect');
var less = require('gulp-less');
var browserify = require('browserify');
var source = require('vinyl-source-stream');
var path = require('path');
var watchify = require('watchify');
var gutil = require('gulp-util');
var minifycss = require('gulp-minify-css');
var uglify = require('gulp-uglify');
var rename = require('gulp-rename');
var del = require('del');
var glob = require('glob');
var es = require('event-stream');

gulp.task('webserver', function() {
    connect.server({
        port:9988,
        livereload: false
    });
});

gulp.task('less', function() {
    gulp.src('less/*.less')
        .pipe(less())
        .pipe(minifycss())
        .pipe(rename({
            dirname:'/',
            extname:'.min.css'
        }))
        .pipe(gulp.dest('dist/css/'))
        .pipe(connect.reload());
});

gulp.task('watchLess', function() {
    gulp.watch('less/*.less', ['less']);
});

gulp.task('browserify', function(done) {
    glob('./src/**.js', function(err, files) {
        if(err) done(err);

        var tasks = files.map(function(entry) {
            return browserify({ entries: [entry] })
                .bundle()
                .pipe(source(entry))
                .pipe(rename({
                    dirname:'/',
                    extname: '.min.js'
                }))
                .pipe(gulp.dest('./assets/js/'));
        });
        es.merge(tasks).on('end', done);
    });
});

gulp.task('watchBrowserify', function() {
    gulp.watch('src/**/*', ['browserify']);
});

gulp.task('default', ['less','browserify','webserver', 'watchLess','watchBrowserify']);

gulp.task('deploy',function(){
    gulp.src([
        'assets/css/**/*'
    ]).pipe(gulp.dest('../src/main/java/assets/css'));
    gulp.src([
        'assets/js/**/*'
    ]).pipe(gulp.dest('../src/main/java/assets/js'));
})
