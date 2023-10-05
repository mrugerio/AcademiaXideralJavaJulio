package com.curso.martes3;

class One {
	void foo() {
	}
}

//public -> protected -> *default -> private

class Two extends One {
	// @Override
	// int foo(){return 0;} // No es valido
	// @Override
	// void foo(){} //Es valido
	// @Override
	// public void foo(){} //Es valido
	
	//private void foo(){} //No es valido por que  baja la visibilidad
	
	protected void foo(){} //Es valido
}
