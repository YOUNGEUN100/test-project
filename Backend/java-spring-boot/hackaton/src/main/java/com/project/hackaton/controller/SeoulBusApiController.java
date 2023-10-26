package com.project.hackaton.controller;

import com.project.hackaton.dto.SeoulBusRequest;
import com.project.hackaton.service.SeoulBusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seoul")
public class SeoulBusApiController {

    private final SeoulBusService seoulBusService;

    @PostMapping("/busId")
    public String getBusId(@RequestBody SeoulBusRequest request) {
        return seoulBusService.getSeoulBusId(request);
    }

    @PostMapping("/station/latlng")
    public String getBusStationByCoordinate(@RequestBody SeoulBusRequest request) {
        return seoulBusService.getSeoulBusStationInfo(request);
    }

    @PostMapping("/station/ord")
    public String getBusStationOrdByBusNumber(@RequestBody SeoulBusRequest request) {
        return seoulBusService.getSeoulBusStationOrd(request);
    }

    @PostMapping("/station/name")
    public String getBusStationByName(@RequestBody SeoulBusRequest request) {
        return seoulBusService.getSeoulBusStationInfo(request);
    }

    @PostMapping("/arrival")
    public String getBusArrivalInfo(@RequestBody SeoulBusRequest request) {
        return seoulBusService.getSeoulBusArrivalInfo(request);
    }
}
