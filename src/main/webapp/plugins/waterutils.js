//IE中trim函数的兼容性
String.prototype.trim = function() {
	return this.replace(/(^\s*)|(\s*$)/g, "");
}

/**
 * 执行一定规则下的ajax
 * 
 * @param url
 * @param method
 * @param func
 */
function executeAjaxUrlForResult(url, setting, done, fail, always) {
	setting.url = url;
	setting.traditional = true;
	$.ajax(setting).done(function(result) {
		if (undefined != done) {
			done(result);
		}
	}).fail(function(jqXHR, textStatus) {
		if (undefined != fail) {
			fail(jqXHR, textStatus);
		}
	}).always(function() {
		if (undefined != always) {
			always();
		}
	})

}

/**
 * js获取url参数
 * 
 * @param name
 * @returns
 */
function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return decodeURI(r[2]);
	return null;
}

/**
 * 2015-10-10 00:00:00 转date
 * 
 * @param str
 */
function toDate(str) {
	str = str.replace(/-/g, "/");
	var oDate1 = new Date(str);
	return oDate1;
}


// 把时间转换成字符串
function timeStamp2String(datetime, formate) {
	var year = datetime.getFullYear();
	var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
	var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
	var hour = datetime.getHours() < 10 ? "0" + datetime.getHours() : datetime.getHours();
	var minute = datetime.getMinutes() < 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
	var second = datetime.getSeconds() < 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
	var str = formate;
	str = str.replace("yyyy", year);
	str = str.replace("MM", month);
	str = str.replace("dd", date);
	str = str.replace("HH", hour);
	str = str.replace("mm", minute);
	str = str.replace("ss", second);
	return str;
}


/**
 * 获取时间间隔
 * 
 * @param unit
 *            时间基数 minute, hour, day, month
 * @param inv
 *            时间间隔数
 * @returns {Number}
 */
function getMillisecondByInv(unit, inv) {
	var base;
	if (unit == 'minute') {
		base = 60 * 1000;
	} else if (unit == 'hour') {
		base = 60 * 60 * 1000;
	} else if (unit == 'day') {
		base = 24 * 60 * 60 * 1000;
	} else if (unit == 'month') {
		base = 31 * 24 * 60 * 60 * 1000;
	}
	return base * parseInt(inv);
}


/**
 * 获取当前月的第一天
 */
function getMonthFirst(date) {
	date.setDate(1);
	return date;
}
/**
 * 获取当前月的最后一天
 */
function getMonthLast(date) {
	var currentMonth = date.getMonth();
	var nextMonth = ++currentMonth;
	var nextMonthFirstDay = new Date(date.getFullYear(), nextMonth, 1);
	var oneDay = 1000 * 60 * 60 * 24;
	return new Date(nextMonthFirstDay - oneDay);
}
var storageSkin = {
		storage_key : "MY_FAV_SKIN",
		save : function(value) {
			localStorage.setItem(this.storage_key, value)
		},
		getSkin : function() {
			var skin_stg = localStorage.getItem(this.storage_key);
			if(null != skin_stg && skin_stg != ""){
				return skin_stg;
			}
			return "normal";
		},
		clear : function() {
			localStorage.removeItem(this.storage_key)
		}
	}
function DateAdd(interval, number, date) {
	/*
	 * --------------- DateAdd(interval,number,date) -----------------
	 * DateAdd(interval,number,date) 功能:实现VBScript的DateAdd功能.
	 * 参数:interval,字符串表达式，表示要添加的时间间隔. 参数:number,数值表达式，表示要添加的时间间隔的个数.
	 * 参数:date,时间对象. 返回:新的时间对象. var now = new Date(); var newDate = DateAdd( "d
	 * ",5,now); author:wanghr100(灰豆宝宝.net) update:2004-5-28 11:46
	 * --------------- DateAdd(interval,number,date) -----------------
	 */
	switch (interval) {
		case "y" : {
			date.setFullYear(date.getFullYear() + number);
			return date;
			break;
		}
		case "q" : {
			date.setMonth(date.getMonth() + number * 3);
			return date;
			break;
		}
		case "m" : {
			date.setMonth(date.getMonth() + number);
			return date;
			break;
		}
		case "w" : {
			date.setDate(date.getDate() + number * 7);
			return date;
			break;
		}
		case "d" : {
			date.setDate(date.getDate() + number);
			return date;
			break;
		}
		case "h" : {
			date.setHours(date.getHours() + number);
			return date;
			break;
		}
		case "m" : {
			date.setMinutes(date.getMinutes() + number);
			return date;
			break;
		}
		case "s" : {
			date.setSeconds(date.getSeconds() + number);
			return date;
			break;
		}
		default : {
			date.setDate(date.getDate() + number);
			return date;
			break;
		}
	}
}

//除法函数，用来得到精确的除法结果
//说明：javascript的除法结果会有误差，在两个浮点数相除的时候会比较明显。这个函数返回较为精确的除法结果。
//调用：accDiv(arg1,arg2)
//返回值：arg1除以arg2的精确结果

function accDiv(arg1, arg2) {
	var t1 = 0, t2 = 0, r1, r2;
	try {
		t1 = arg1.toString().split(".")[1].length;
	} catch (e) {
	}
	try {
		t2 = arg2.toString().split(".")[1].length;
	} catch (e) {
	}
	with (Math) {
		r1 = Number(arg1.toString().replace(".", ""));
		r2 = Number(arg2.toString().replace(".", ""));
		return (r1 / r2) * pow(10, t2 - t1);
	}
}
//乘法函数，用来得到精确的乘法结果
//说明：javascript的乘法结果会有误差，在两个浮点数相乘的时候会比较明显。这个函数返回较为精确的乘法结果。
//调用：accMul(arg1,arg2)
//返回值：arg1乘以arg2的精确结果
function accMul(arg1, arg2) {
	var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
	try {
		m += s1.split(".")[1].length;
	} catch (e) {
	}
	try {
		m += s2.split(".")[1].length;
	} catch (e) {
	}
	return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m);
}
//加法函数，用来得到精确的加法结果
//说明：javascript的加法结果会有误差，在两个浮点数相加的时候会比较明显。这个函数返回较为精确的加法结果。
//调用：accAdd(arg1,arg2)
//返回值：arg1加上arg2的精确结果
function accAdd(arg1, arg2) {
	var r1, r2, m;
	try {
		r1 = arg1.toString().split(".")[1].length;
	} catch (e) {
		r1 = 0;
	}
	try {
		r2 = arg2.toString().split(".")[1].length;
	} catch (e) {
		r2 = 0;
	}
	m = Math.pow(10, Math.max(r1, r2));
	return (arg1 * m + arg2 * m) / m;
}
//减法
function accSub(arg1,arg2){
 var r1,r2,m,n;
 try{r1=arg1.toString().split(".")[1].length;}catch(e){r1=0;}
 try{r2=arg2.toString().split(".")[1].length;}catch(e){r2=0;}
 m=Math.pow(10,Math.max(r1,r2));
 //last modify by deeka
 //动态控制精度长度
 n=(r1>=r2)?r1:r2;
 return ((arg1*m-arg2*m)/m);
}