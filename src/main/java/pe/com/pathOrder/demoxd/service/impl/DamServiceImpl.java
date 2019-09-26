package pe.com.pathOrder.demoxd.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pathOrder.demoxd.model.Dam;
import pe.com.pathOrder.demoxd.repository.DamRepository;
import pe.com.pathOrder.demoxd.service.DamService;

public class DamServiceImpl implements DamService{
	@Autowired
	private DamRepository damRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Dam> findAll() throws Exception {
		return damRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Dam> findById(Integer id) throws Exception {
		return damRepository.findById(id);
	}

	@Override
	public Dam save(Dam t) throws Exception {
		return damRepository.save(t);
	}

	@Override
	public Dam update(Dam t) throws Exception {
		return damRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		damRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		damRepository.deleteAll();
	}
	
}
