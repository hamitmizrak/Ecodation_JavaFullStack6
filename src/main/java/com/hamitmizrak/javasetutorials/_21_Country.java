package com.hamitmizrak.javasetutorials;
import lombok.Getter;
import lombok.Setter;

//Inner Class: iç içe java classları
// java 1 tane public class vardır(inner class Hariç)
// javada classlar static olamaz (inner class Hariç)
public class _21_Country {

    //field
    @Getter
    @Setter
    private String countryName;

    //Inner class City
    public static class City {
        @Getter
        @Setter
        private String cityName;

        //Inner Class neighbourhood
        public static class Neighbourhood {
            @Getter
            @Setter
            private String neighbourhoodName;
        }
    }
}

class MainClassData{
    public static void main(String[] args) {
        _21_Country country=new _21_Country();
        country.setCountryName("Türkiye");

        _21_Country.City city=new _21_Country.City();
        city.setCityName("Ankara");

        _21_Country.City.Neighbourhood neighbourhood=new _21_Country.City.Neighbourhood();
        neighbourhood.setNeighbourhoodName("Kızılay");

        System.out.println(country.getCountryName()+"-"+city.getCityName()+"-"+neighbourhood.getNeighbourhoodName());
    }
}
