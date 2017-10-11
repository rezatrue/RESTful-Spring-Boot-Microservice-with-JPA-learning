package com.example.ec.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec.domain.Defficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
import com.example.ec.repo.TourRepository;

@Service
public class TourService {
	private TourPackageRepository tourPackageRepository;
	private TourRepository tourRepository;
	@Autowired
	public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
		super();
		this.tourPackageRepository = tourPackageRepository;
		this.tourRepository = tourRepository;
	}
	
	public Tour createTour(Integer id, String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, String tourPackageCode, Defficulty defficulty, Region region) {
		TourPackage tourPackage = tourPackageRepository.findOne(tourPackageCode);
		if(tourPackage == null){
			throw new RuntimeException("Tour Package doesn't exist" + tourPackageCode);
		}
		
		return tourRepository.save(new Tour(id, title, description, blurb, price, duration, bullets, keywords, tourPackage, defficulty, region));
		
	}
	
	public Iterable<Tour> lookup(){
		return tourRepository.findAll();
	}
	
	public long total(){
		return tourRepository.count();
	}
	


}
