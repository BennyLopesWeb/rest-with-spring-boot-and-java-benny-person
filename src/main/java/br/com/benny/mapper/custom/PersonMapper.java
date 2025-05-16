package br.com.benny.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.benny.data.vo.v2.PersonVOV2;
import br.com.benny.model.Person;

@Service
public class PersonMapper {

	public PersonVOV2 convertEntityToVo(Person person) {
		
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setAddres(person.getAddres());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		
		return vo;
	}
	
	public Person convertVoToEntity(PersonVOV2 person) {
		
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setAddres(person.getAddres());
		//entity.setBirthDay(new Date());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setGender(person.getGender());
		
		return entity;
	}
}