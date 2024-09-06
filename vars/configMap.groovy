def callMethod(Map config = [:]){
    if(config.name != '' && config.dayOfWeek != ''){
        echo "Hello ${config.name}. Today is ${config.dayOfWeek}"
    }
    else{
        echo "Name or DayOfWeek is empty"
    }
    
}