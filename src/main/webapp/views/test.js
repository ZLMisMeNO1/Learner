
function initEchart(con, theme) {
    theme = theme?theme:"";
    var chart = echarts.init(document.getElementById(con), theme);
    var option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            show: false
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: (function () {
                var arr = []
                for (var i = 0; i < 24; i++) {
                    arr.push(i + "点")
                }
                return arr
            })()
        },
        yAxis: {
            type: 'value',
            boundaryGap: ['20%', '20%']
        },
        grid: {
            top: 20,
            bottom: 30,
            left: 30,
            right: 20
        },
        series: [
            {
                name: '24小时',
                type: 'line',
                data: (function () {
                    var arr = []
                    for (var i = 0; i < 12; i++) {
                        arr.push(Math.random().toFixed(2))
                    }
                    return arr
                })()
            },
        ]
    };
    chart.setOption(option)
}
