define(["avalon","domReady!","mmRequest","text!./index.html","./../../../vendor/avalon.oniui/pager/avalon.pager"],
       function(avalon, domReady,mmRequest,index) {

           avalon.templateCache.index = index;

           var indexVm = avalon.define({
               $id: "index",
               items: {},
               paginationOpt:{
                   perPages: 10,
                   currentPage: 1,
                   showJumper: false,
                   onJump: function(e, data) {
                       avalon.log('pager on clicked');
                       location.href = "#page=" + data.currentPage;
                       indexVm.paginate(data.currentPage);
                   }
               },
               paginate: function(page){
                   var url = "";
                   if(page%2==0){
                       url = "/api/item1.json";
                   }else{
                       url = "/api/item2.json";
                   }
                   return avalon.get(url,[],function(data){
                       indexVm.items = data.slice(0,10);

                       avalon.vmodels.pagination.totalItems = data.length;
                       avalon.log(data.length);
                   },"json");
               },
               $skipArray: ['paginationOpt']
           });

           indexVm.paginate(1);
           avalon.vmodels.root.body = "index";
       });
