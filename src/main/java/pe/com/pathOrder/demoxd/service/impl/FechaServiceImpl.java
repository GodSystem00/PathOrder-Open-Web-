package pe.com.pathOrder.demoxd.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pathOrder.demoxd.model.Fecha;
import pe.com.pathOrder.demoxd.repository.FechaRepository;
import pe.com.pathOrder.demoxd.service.FechaService;

public class FechaServiceImpl implements FechaService{
	@Autowired
	private FechaRepository fechaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Fecha> findAll() throws Exception {
		return fechaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Fecha> findById(Integer id) throws Exception {
		return fechaRepository.findById(id);
	}

	@Override
	public Fecha save(Fecha t) throws Exception {
		return fechaRepository.save(t);
	}

	@Override
	public Fecha update(Fecha t) throws Exception {
		return fechaRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		fechaRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		fechaRepository.deleteAll();
	}
	
}
