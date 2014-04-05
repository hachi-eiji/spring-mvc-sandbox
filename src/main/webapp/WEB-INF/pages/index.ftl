<!DOCTYPE html>
<html>
<body>
</body>
</html>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script>
    (function(){
        'use strict';
        var data = {
            foo: 1,
            bars:[
                { id:1, value: 'bar1' },
                { id:2, value: 'bar2' }
            ]
        };
        $.post('/post', data, function(res){
            console.log(res);
        });
    })();
</script>
