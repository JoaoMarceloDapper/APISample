package br.edu.atitus.api_sample.services;

import org.springframework.data.repository.config.RepositoryConfigurationUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.atitus.api_sample.entities.UserEntity;
import br.edu.atitus.api_sample.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	private final UserRepository repository;
	private final PasswordEncoder encoder;

	public UserService(UserRepository repository, PasswordEncoder encoder) {
		super();
		this.repository = repository;
		this.encoder = encoder;
	}
	
	public UserEntity save(UserEntity user) throws Exception {
		if (user == null)
			throw new Exception("Objeto Nulo!");
		if (user.getEmail() == null || user.getEmail().isEmpty())
			throw new Exception("E-mail invalido");
		if(repository.existsByEmail(user.getEmail()))
			throw new Exception("Ja existe usuario cadastrado com este e-mail");
		if (user.getEmail() == null || user.getName().isEmpty())
			throw new Exception("Nome invalido");
		if (user.getEmail() == null || user.getPassword().isEmpty())
			throw new Exception("Password invalido");
		if (user.getType() == null)
			throw new Exception("Tipo de usuario invalido");
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		return repository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		var user = repository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("Usuario nao encontrado com este e-mail"));
		return user;
	}

}
