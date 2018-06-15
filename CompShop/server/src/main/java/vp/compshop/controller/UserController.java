//package vp.compshop.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import vp.compshop.model.user.Login;
//import vp.compshop.security.TokenUtils;
//
//@RestController
//public class UserController {
//
//	@Autowired
//	AuthenticationManager authenticationManager;
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//
//	@Autowired
//	TokenUtils tokenUtils;
//
//	@PostMapping(value = "/api/login")
//	public ResponseEntity<String> login(@RequestBody Login login) {
//		try {
//			final UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
//					login.getUsername(), login.getPassword());
//			final Authentication authentication = authenticationManager.authenticate(token);
//			SecurityContextHolder.getContext().setAuthentication(authentication);
//			final UserDetails details = userDetailsService.loadUserByUsername(login.getUsername());
//			final String getToken = tokenUtils.generateToken(details);
//
//			return new ResponseEntity<>(getToken, HttpStatus.OK);
//		} catch (Exception error) {
//			return new ResponseEntity<>("Invalid login!", HttpStatus.BAD_REQUEST);
//		}
//	}
//
//}
