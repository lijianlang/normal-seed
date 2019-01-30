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
            axios.post('/login/in', _this.loginForm).then(function (result) {
                console.log(result)

            })
        }
    }
});