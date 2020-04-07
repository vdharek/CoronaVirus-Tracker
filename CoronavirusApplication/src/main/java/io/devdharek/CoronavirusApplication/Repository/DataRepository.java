package io.devdharek.CoronavirusApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import io.devdharek.CoronavirusApplication.Model.ApiData;

public interface DataRepository extends CrudRepository<ApiData, Long> {

}
