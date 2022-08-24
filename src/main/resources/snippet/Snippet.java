package snippet;

public class Snippet {
	@PostMapping("/users")
		public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
			User savedUser = service.save(user);
			// CREATED
			// /user/{id}     savedUser.getId()
			
			URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
			
			return ResponseEntity.created(location).build();
			
		}
}

