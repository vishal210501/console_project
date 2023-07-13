package com.bean;

public class Not_Found_Exception {

	public class NotFoundException extends RuntimeException {

		public NotFoundException() {
			super();
		}

		public NotFoundException(String ms) {
			super(ms);
		}

	}

}
