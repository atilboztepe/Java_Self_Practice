package day04_practice_tasks;

public class HttpStatusCode {
    public static void main(String[] args) {
        int statusCode = 200;

        String meaning = "";

        switch(statusCode){
            case 200 :
                meaning = "OK";
                break;
            case 201 :
                meaning = "Created";
                break;
            case 202 :
                meaning = "Accepted";
                break;
            case 301 :
                meaning = "Moved Permanently";
                break;
            case 303 :
                meaning = "See Other";
                break;
            case 304 :
                meaning = "Not Modified";
                break;
            case 307 :
                meaning = "Temporary Redirect";
                break;
            case 400 :
                meaning = "Bad Request";
                break;
            case 401 :
                meaning = "Unauthorized";
                break;
            case 403 :
                meaning = "Forbidden";
                break;
            case 404 :
                meaning = "Not Found";
                break;
            case 410 :
                meaning = "Gone";
                break;
            case 500 :
                meaning = "Internal Server Error";
                break;
            case 503 :
                meaning = "Service Unavailable";
                break;
            default:
                meaning = "It is not in this list";
                break;
        }
        System.out.println(meaning);


    }
}
