'use strict';

var vm = new Vue({
    el: "#app",
    data:{
        loginForm:{
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