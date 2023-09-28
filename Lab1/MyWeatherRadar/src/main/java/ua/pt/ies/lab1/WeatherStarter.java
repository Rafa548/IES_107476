package ua.pt.ies.lab1;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.pt.ies.lab1.IpmaCityForecast; //may need to adapt package name
import ua.pt.ies.lab1.IpmaService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    //todo: should generalize for a city passed as argument
    private static final int CITY_ID_AVEIRO = 1010500;
    private static int CITY_ID_;
    private static Logger logger = LogManager.getLogger(WeatherStarter.class);


    public static void  main(String[] args ) {

        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);

        CITY_ID_ = Integer.parseInt(args[0]);

        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        
        
        // prepare the call to remote endpoint
        //Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_);


        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                var firstDay = forecast.getData().listIterator().next();

                System.out.printf( "max temp for %s is %4.1f %n",
                        firstDay.getForecastDate(),
                        Double.parseDouble(firstDay.getTMax()));
            } else {
                System.out.println( "No results for this request!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
