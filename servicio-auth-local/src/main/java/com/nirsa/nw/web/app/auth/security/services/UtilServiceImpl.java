package com.nirsa.nw.web.app.auth.security.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nirsa.nw.web.app.auth.models.dao.IUsuarioDao;
import com.nirsa.nw.web.app.auth.models.entity.User;

@Service
public class UtilServiceImpl implements UtilService{
	
	@Autowired
	IUsuarioDao userDao;
	
	@Value("${nirsa.nw.web.app.secretPassword}")
	private String secretPassword;
	
	@Autowired
	PasswordEncoder encoder;

	@Override
	@Transactional
	public void encriptarClave(String idusuario) {
		User user = userDao.buscarUsuario(idusuario);
		
		if(user.getPassword() == null) {
			String claveFinal  = user.getIdusuario().concat(user.getClave()).concat(secretPassword);
			user.setPassword(encoder.encode(claveFinal));
			userDao.save(user);
		}
	}
	
}
