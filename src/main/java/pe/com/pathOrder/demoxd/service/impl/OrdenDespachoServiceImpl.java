package pe.com.pathOrder.demoxd.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pathOrder.demoxd.model.OrdenDespacho;
import pe.com.pathOrder.demoxd.repository.OrdenDespachoRepository;
import pe.com.pathOrder.demoxd.service.OrdenDespachoService;
@Service
public class OrdenDespachoServiceImpl implements OrdenDespachoService{
	@Autowired
	private OrdenDespachoRepository ordenDespachoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<OrdenDespacho> findAll() throws Exception {
		return ordenDespachoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<OrdenDespacho> findById(Integer id) throws Exception {
		return ordenDespachoRepository.findById(id);
	}

	@Override
	public OrdenDespacho save(OrdenDespacho t) throws Exception {
		return ordenDespachoRepository.save(t);
	}

	@Override
	public OrdenDespacho update(OrdenDespacho t) throws Exception {
		return ordenDespachoRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		ordenDespachoRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		ordenDespachoRepository.deleteAll();
	}
	
	
}
