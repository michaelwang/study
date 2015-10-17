define(["avalon","domReady!","mmRequest","text!./login.html"], function(avalon, domReady,mmRequest,login) {

    avalon.templateCache.login = login

    var loginVm = avalon.define({
        $id: "login",
        loginCheck: function(){
            window.location="/admin.html"
        }
    })

    avalon.vmodels.root.body = "login"
})
