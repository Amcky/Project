(function(a){var b={bind:function(c,d,e){d=d.replace(/^on/i,"").toLowerCase();if(c.addEventListener){c.addEventListener(d,e,false)}else{if(c.attachEvent){c.attachEvent("on"+d,e)}}return c},sendByImage:function(d,f){var c=new Image();var e="cpro_log_"+Math.floor(Math.random()*2147483648).toString(36);f=f||a;f[e]=c;c.onload=c.onerror=c.onabort=function(){c.onload=c.onerror=c.onabort=null;f[e]=null;c=null};c.src=d},loadHandler:function(){try{var e=timeStatisticObj.startTime||0;var h=timeStatisticObj.renderTime||0;var f=timeStatisticObj.size||0;var m=0,l=0,k=f,j=h,i=(new Date()).getTime()-e;var c=(new Date()).getTime();var d="//eclick.baidu.com/time.jpg?stamp="+c+"&s1="+m+"&s2="+l+"&s3="+k+"&s4="+j+"&s5="+i;if(typeof timeStatisticObj.styleId!=="undefined"){d=d+"&templateid="+timeStatisticObj.styleId}if(typeof timeStatisticObj.feid!=="undefined"&&timeStatisticObj.feid!=="$feid$"){d=d+"&feid="+timeStatisticObj.feid}b.sendByImage(d)}catch(g){}finally{}}};b.bind(a,"load",b.loadHandler)})(window);