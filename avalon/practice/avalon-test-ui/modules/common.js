require.config({
    baseUrl: '/',
    paths: {
        jquery: "/vendor/jquery-1.11.3",
        avalon: "/vendor/avalon.shim",
        text: "/vendor/text",
        mmRequest: "/vendor/mmRequest",
        mmPromise: "/vendor/mmPromise",
        domReady: "/vendor/domReady",
        css: "/vendor/css"
    },
    priority: ['text', 'css'],
    shim: {
        jquery: {
            exports: "jQuery"
        },
        avalon: {
            exports: "avalon"
        }
    }
});
require(['avalon', "domReady!"],
        function(avalon,domReady) {
            avalon.templateCache.empty = " ";
            var commonVm = avalon.define({
                $id: "root",
                body: "empty",
                header: "empty",
                footer: "empty"
            });

            avalon.scan(document.body);
        });
