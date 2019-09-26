package pe.com.pathOrder.demoxd.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pathOrder.demoxd.model.Mercaderia;
import pe.com.pathOrder.demoxd.repository.MercaderiaRepository;
import pe.com.pathOrder.demoxd.service.MercaderiaService;

public class MercaderiaServiceImpl implements MercaderiaService{
	@Autowired
	private MercaderiaRepository mercaderiaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Mercaderia> findAll() throws Exception {
		return mercaderiaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Mercaderia> findById(Integer id) throws Exception {
		return mercaderiaRepository.findById(id);
	}

	@Override
	public Mercaderia save(Mercaderia t) throws Exception {
		return mercaderiaRepository.save(t);
	}

	@Override
	public Mercaderia update(Mercaderia t) throws Exception {
		return mercaderiaRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		mercaderiaRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		mercaderiaRepository.deleteAll();
	}
	
}
