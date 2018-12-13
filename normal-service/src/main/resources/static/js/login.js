'use strict';

var vm = new Vue({
    el: "#app",
    data:{
        message: "my first vue",
        form:{
            username:'',
            password:''
        }
    },
    methods:{
        onSubmit: function onSubmit() {
            var _this = this;
            alert("username:" + _this.form.username)
        }
    }
});