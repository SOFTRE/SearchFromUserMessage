var vue = new Vue({
    el: "#app",
    data: {
        userList: [],
        user: {}
    },
    methods: {
        findAll: function () {
            axios.get("./user/findAll").then(function (response) {
                vue.userList = response.data;
            }).catch(function (error) {

            }).finally(function () {

            });
        },
        /*
        RestFul风格
        findById:function (id) {
            axios.get("./user/findById/"+id).then(function (response) {
                vue.user=response.data;
            }).catch(function (error) {

            }).finally(function () {

            });
        }
        */
        findById: function (id) {
            axios.get("./user/findById", {params: {id: id}}).then(function (response) {
                vue.user = response.data;
            }).catch(function (error) {

            }).finally(function () {

            });
        },
        update: function () {
            axios.post("./user/update", vue.user).then(function (response) {
                vue.findAll();
            }).catch(function (error) {
                alert(error);
            });
        }
    },
    created: function () {
        this.findAll();
    }

});