const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot22c8q/",
            name: "springboot22c8q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot22c8q/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "驾校报名小程序"
        } 
    }
}
export default base
