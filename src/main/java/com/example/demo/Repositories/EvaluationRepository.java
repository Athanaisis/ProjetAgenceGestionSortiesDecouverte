package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

	// LE TRI DES EVALUATIONS PAR NOTE DESCENDANT PAR DEFAUT

	@Query("Select e from Evaluation e order by note")
	List<Evaluation> findByNoteOrderDesc();
}
