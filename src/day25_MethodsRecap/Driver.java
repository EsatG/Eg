package day25_MethodsRecap;

public class Driver {

    /*
    . write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox",  "safari", "edge", "Opera"},
				 then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
		2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements

     */

    public static void main(String[] args) {

       String str = getDriver1("SaFaRi");   // argument is mandatory

       String str2 = getDriver2("opera");
       String str3 = getDriver3("edge");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);


    }

    public static String getDriver1(String browserName){
        String result = "";

        switch (browserName.toLowerCase()){     //  "ChromE".toLowerCase() ==> chrome

            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
                result = "Firefox Driver";
                break;
            case  "safari" :
                result = "Safari Driver";
                break;
            case "edge" :
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            default:
                result = "Invalid Driver";
        }




        return result;
    }


    public static String getDriver2 (String browserName){

        /*
        String result ="";

        if (browserName.equalsIgnoreCase("chrome")){
            result = "Chrome Driver";
        } else if (browserName.equalsIgnoreCase("firefox")){
            result = "Firefox Driver";
        } else if (browserName.equalsIgnoreCase("safari")){
            result = "Safari Driver";
        } else if (browserName.equalsIgnoreCase("Edge")){
            result = "Edge Driver";
        } else if (browserName.equalsIgnoreCase("Opera")){
            result = "Opera Driver";
        } else {
            result = "Invalid Driver";
        }

        return result;

         */


        if (browserName.equalsIgnoreCase("chrome")){
            return "Chrome Driver";
        } else if (browserName.equalsIgnoreCase("firefox")){
            return  "Firefox Driver";
        } else if (browserName.equalsIgnoreCase("safari")){
            return "Safari Driver";
        } else if (browserName.equalsIgnoreCase("Edge")){
            return  "Edge Driver";
        } else if (browserName.equalsIgnoreCase("Opera")){
            return "Opera Driver";
        } else {
            return "Invalid Driver";
        }


    }


    public static String getDriver3 (String browserName){

        browserName  = browserName.toLowerCase();
        String result = "";

        result = ( browserName.equals("chrome")) ? "Chrome Driver"
                : ( browserName.equals("safari")) ? "Safari Driver"
                : ( browserName.equals("firefox")) ? "Firefox Driver"
                : ( browserName.equals("edge")) ? "Edge Driver"
                : ( browserName.equals("opera")) ? "Opera Driver"
                : "Invalid Driver";


        return result;
    }



















}
