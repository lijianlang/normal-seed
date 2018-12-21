<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/static/plugins/elementUI/lib/theme-default/index.css">
</head>

<body>
<div id="app">
    <el-container>
        <el-header>

        </el-header>

        <el-main>
            <el-form ref="form" :model="loginForm" label-width="80px">
                <el-form-item label="用户名">
                    <el-input v-model="loginForm.username" style="width: auto"></el-input>
                </el-form-item>
                <el-form-item label="密码">
                    <el-input v-model="loginForm.password" style="width: auto"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="onSubmit()">登陆</el-button>
                </el-form-item>
            </el-form>
        </el-main>

        <el-footer>
        </el-footer>
    </el-container>





</div>
</body>
<script src="/static/plugins/vue/vue.min.js"></script>
<script src="/static/plugins/elementUI/lib/index.js"></script>
<script src="/static/plugins/axios/axios.min.js"></script>
<script src="/static/js/login.js"></script>
</html>
