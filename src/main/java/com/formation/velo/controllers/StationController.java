package com.formation.velo.controllers;


import com.formation.velo.model.Station;
import com.formation.velo.service.StationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class StationController {

	private final StationService stationService;

	public StationController(StationService stationService) {
		this.stationService = stationService;
	}


	@GetMapping("stations")
	public ResponseEntity<List<Station>> getAll(){
		List<Station> stations = stationService.findAll();
		return ResponseEntity.ok(stations);
	}

	@GetMapping("stations/{id}")
	public ResponseEntity<Optional<Station>> getPersoneById(@PathVariable Integer id){
		Optional<Station> station = stationService.findById(id);
		
		return ResponseEntity.ok(station);
	}

	@PostMapping("stations/add")
	public ResponseEntity<Station> add(@RequestParam String name,@RequestParam double lattitude, @RequestParam double longitude,
									   @RequestParam String status, @RequestParam int bikeStands, @RequestParam int availableBikes, @RequestParam int availableBikeStands,
									   @RequestParam String recordId, @RequestParam String address){

		Station stations = stationService.save(Station.builder().name(name).lattitude(lattitude).longitude(longitude)
				.status(status).bikeStands(bikeStands).availableBikes(availableBikes).availableBikeStands(availableBikeStands)
				.recordId(recordId).address(address).build());
		return ResponseEntity.ok(stations);
	}



	@DeleteMapping("stations/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		stationService.deleteById(id);
		return ResponseEntity.ok("deleted");
	}

	@PostMapping("stations/update")
	public ResponseEntity<String> update(@RequestBody Station user){
		stationService.save(user);
		return ResponseEntity.ok("updated");
	}


}
