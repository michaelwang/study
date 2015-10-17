define(["avalon","domReady!", "text!/modules/header/header.html"], function(avalon, domReady,header) {

    avalon.templateCache.header = header

    avalon.define({
        $id: "header",
        header: "empty",
    })

    avalon.vmodels.root.header = "header"
})
