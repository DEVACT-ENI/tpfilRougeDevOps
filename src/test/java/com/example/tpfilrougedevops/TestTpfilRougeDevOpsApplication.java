package com.example.tpfilrougedevops;

import org.springframework.boot.SpringApplication;

public class TestTpfilRougeDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.from(TpfilRougeDevOpsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
