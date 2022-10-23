package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;

class GeoServiceImplTest {
    private GeoService geoService;
    @BeforeEach
    void setUp(){
        geoService = new GeoServiceImpl();
    }
    @Test
    void byIp_ifRuLocal() {
        Assertions.assertEquals(Country.RUSSIA, geoService.byIp("172.").getCountry());
    }
    @Test
    void byIp_ifEngLocal() {
        Assertions.assertEquals(Country.USA, geoService.byIp("96.").getCountry());
    }
}