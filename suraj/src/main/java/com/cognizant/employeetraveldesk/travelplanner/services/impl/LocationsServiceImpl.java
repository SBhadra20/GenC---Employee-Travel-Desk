package com.cognizant.employeetraveldesk.travelplanner.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeetraveldesk.travelplanner.payloads.LocationsDto;
import com.cognizant.employeetraveldesk.travelplanner.repositories.LocationsRepo;
import com.cognizant.employeetraveldesk.travelplanner.services.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService {
	@Autowired
	private LocationsRepo locationsRepo;

	@Override
	public LocationsDto createLocations(LocationsDto locations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationsDto updateLocations(LocationsDto locations, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationsDto getLocationsById(Integer id) {
		return null;
	}

	@Override
	public List<LocationsDto> getAllLocations() {
		locationsRepo.findAll();
		return null;
	}

	@Override
	public void deleteLocations(Integer id) {
		// TODO Auto-generated method stub

	}

}
