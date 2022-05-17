package cestel.sercom.post.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cestel.sercom.enu.RolesEnum;
import cestel.sercom.post.entity.Addins;
import cestel.sercom.post.entity.AddinsDev;
import cestel.sercom.post.entity.AddinsPlg;
import cestel.sercom.post.entity.AddinsProp;
import cestel.sercom.post.entity.Answers;
import cestel.sercom.post.entity.DnDevice;
import cestel.sercom.post.entity.Dns;
import cestel.sercom.post.entity.Domain;
import cestel.sercom.post.entity.License;
import cestel.sercom.post.entity.Logs;
import cestel.sercom.post.entity.PropResource;
import cestel.sercom.post.entity.Resource;
import cestel.sercom.post.entity.ResourceCalendar;
import cestel.sercom.post.entity.ResourceVector;
import cestel.sercom.post.entity.RruleCal;
import cestel.sercom.post.entity.RruleCmp;
import cestel.sercom.post.entity.RruleDn;
import cestel.sercom.post.entity.RruleVec;
import cestel.sercom.post.entity.Rules;
import cestel.sercom.post.entity.Sites;
import cestel.sercom.post.entity.SubDomain;
import cestel.sercom.post.entity.Syspropcoll;
import cestel.sercom.post.entity.Sysprops;
import cestel.sercom.post.entity.Users;
import cestel.sercom.post.entity.UsrDns;
import cestel.sercom.post.entity.UsrTeam;
import cestel.sercom.post.service.AddinsDevService;
import cestel.sercom.post.service.AddinsPlgService;
import cestel.sercom.post.service.AddinsPropService;
import cestel.sercom.post.service.AddinsService;
import cestel.sercom.post.service.AnswersService;
import cestel.sercom.post.service.DnDeviceService;
import cestel.sercom.post.service.DnsService;
import cestel.sercom.post.service.DomainService;
import cestel.sercom.post.service.LicenseService;
import cestel.sercom.post.service.LogsService;
import cestel.sercom.post.service.PropResourceService;
import cestel.sercom.post.service.ResourceCalendarService;
import cestel.sercom.post.service.ResourceService;
import cestel.sercom.post.service.ResourceVectorService;
import cestel.sercom.post.service.RruleCalService;
import cestel.sercom.post.service.RruleCmpService;
import cestel.sercom.post.service.RruleDnService;
import cestel.sercom.post.service.RruleVecService;
import cestel.sercom.post.service.RulesService;
import cestel.sercom.post.service.SitesService;
import cestel.sercom.post.service.SubDomainService;
import cestel.sercom.post.service.SyspropcollService;
import cestel.sercom.post.service.SyspropsService;
import cestel.sercom.post.service.UsersService;
import cestel.sercom.post.service.UsrDnsService;
import cestel.sercom.post.service.UsrTeamService;
import lombok.extern.slf4j.Slf4j;

//@Transactional
@Slf4j
@Component("EjecutaMigracion")
public class EjecutaMigracion {

	@Autowired
	private UsersService usersServicePost;

	@Autowired
	private DomainService domainServicePost;

	@Autowired
	private SubDomainService subDomainServicePost;

	@Autowired
	private AddinsService addinsServicePost;

	@Autowired
	private AddinsDevService addinsDevServicePost;

	@Autowired
	private AddinsPlgService addinsPlgServicePost;

	@Autowired
	private AddinsPropService addinsPropServicePost;

	@Autowired
	private AnswersService answersServicePost;

	@Autowired
	private DnsService dnsServicePost;

	@Autowired
	private DnDeviceService dnDeviceServicePost;

	@Autowired
	private LicenseService licenseServicePost;

	@Autowired
	private LogsService logsServicePost;

	@Autowired
	private ResourceService resourceServicePost;

	@Autowired
	private ResourceVectorService resourceVectorServicePost;

	@Autowired
	private ResourceCalendarService resourceCalendarServicePost;

	@Autowired
	private PropResourceService propResourceServicePost;

	@Autowired
	private RulesService rulesServicePost;

	@Autowired
	private RruleCalService rulesCalServicePost;

	@Autowired
	private RruleCmpService rulesCmpServicePost;

	@Autowired
	private RruleDnService rulesDnServicePost;

	@Autowired
	private RruleVecService rulesVecServicePost;

	@Autowired
	private SitesService sitesServicePost;

	@Autowired
	private SyspropsService syspropsServicePost;

	@Autowired
	private SyspropcollService syspropcollServicePost;

	@Autowired
	private UsrDnsService usrDnsServicePost;

	@Autowired
	private UsrTeamService usrTeamServicePost;

	@Autowired
	private cestel.sercom.maria.service.UsersService usersServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.DomainService domainServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.SubDomainService subDomainServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RolesService rolesServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.AddinsService addinsServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.AddinsDevService addinsDevServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.AddinsPlgService addinsPlgServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.AddinsPropService addinsPropServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.AnswersService answersServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.DnsService dnsServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.DnDeviceService dnDeviceServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.LicenseService licenseServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.LogsService logsServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.ResourceService resourceServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.PropResourceService propResourceServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.ResourceVectorService resourceVectorServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.ResourceCalendarService resourceCalendarServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RulesService rulesServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RruleCalService rulesCalServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RruleCmpService rulesCmpServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RruleDnService rulesDnServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.RruleVecService rulesVecServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.SitesService sitesServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.SyspropsService syspropsServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.SyspropcollService syspropcollServiceMaria;

	@Autowired
	private cestel.sercom.maria.service.UsrDnsService usrDnsServiceMaria;
	
	@Autowired
	private cestel.sercom.maria.service.UsrTeamService usrTeamServiceMaria;

	public void ejecutarMigracion() {

		// tabla usuarios
		// datos origen
		log.info("tabla usuario");
		List<Users> usuariosList = usersServicePost.findAll();

		usuariosList.stream().forEach(usu -> mapeaUsuario(usu));
		if (usuariosList.size() > 0)
			log.info("tabla usuario migrada OK");
		else
			log.info("tabla usuario vacia. Nada que migrar");

		// tabla domain
		// datos origen
		log.info("tabla domain");
		List<Domain> domainList = domainServicePost.findAll();

		domainList.stream().forEach(dom -> mapeaDominio(dom));
		if (domainList.size() > 0)
			log.info("tabla dominio migrada OK");
		else
			log.info("tabla dominio vacia. Nada que migrar");

		// tabla subDomain
		// datos origen
		log.info("tabla subDomain");
		List<SubDomain> subDomainList = subDomainServicePost.findAll();

		subDomainList.stream().forEach(subdom -> mapeaSubDominio(subdom));
		if (subDomainList.size() > 0)
			log.info("tabla subDomain migrada OK");
		else
			log.info("tabla subDomain vacia. Nada que migrar");

		// tabla roles
		// al no existir una tabla previa de roles, esta se carga directamente con los
		// datos del enum propio
		log.info("tabla roles");
		mapeaRoles();

		log.info("tabla roles migrada OK");

		// tabla addins
		// datos origen
		log.info("tabla addins");
		List<Addins> addinsList = addinsServicePost.findAll();

		addinsList.stream().forEach(add -> mapeaAddins(add));
		if (addinsList.size() > 0)
			log.info("tabla addins migrada OK");
		else
			log.info("tabla addins vacia. Nada que migrar");

		// tabla addinsDev
		// datos origen
		log.info("tabla addinsDev");
		List<AddinsDev> addinsDevList = addinsDevServicePost.findAll();

		addinsDevList.stream().forEach(add -> mapeaAddinsDev(add));
		if (addinsDevList.size() > 0)
			log.info("tabla addinsDev migrada OK");
		else
			log.info("tabla addinsDev vacia. Nada que migrar");

			// tabla addinsPlg
		// datos origen
		log.info("tabla addinsPlg");
		List<AddinsPlg> addinsPlgList = addinsPlgServicePost.findAll();

		addinsPlgList.stream().forEach(add -> mapeaAddinsPlg(add));
		if (addinsPlgList.size() > 0)
			log.info("tabla addinsPlg migrada OK");
		else
			log.info("tabla addinsPlg vacia. Nada que migrar");

			// tabla addinsProp
		// datos origen
		log.info("tabla addinsProp");
		List<AddinsProp> addinsPropList = addinsPropServicePost.findAll();

		addinsPropList.stream().forEach(add -> mapeaAddinsProp(add));
		if (addinsPropList.size() > 0)
			log.info("tabla addinsProp migrada OK");
		else
			log.info("tabla addinsProp vacia. Nada que migrar");

			// tabla answers
		// datos origen
		log.info("tabla answers");
		List<Answers> answersList = answersServicePost.findAll();

		answersList.stream().forEach(add -> mapeaAnswers(add));
		if (answersList.size() > 0)
			log.info("tabla answers migrada OK");
		else
			log.info("tabla answers vacia. Nada que migrar");

				// tabla dnDevice
		// datos origen
		log.info("tabla dnDevice");
		List<DnDevice> dnDeviceList = dnDeviceServicePost.findAll();

		dnDeviceList.stream().forEach(add -> mapeaDnDevice(add));
		if (dnDeviceList.size() > 0)
			log.info("tabla dnDevice migrada OK");
		else
			log.info("tabla dnDevice vacia. Nada que migrar");

					// tabla dns
		// datos origen
		log.info("tabla dns");
		List<Dns> dnsList = dnsServicePost.findAll();

		dnsList.stream().forEach(add -> mapeaDns(add));
		if (dnsList.size() > 0)
			log.info("tabla dns migrada OK");
		else
			log.info("tabla dns vacia. Nada que migrar");

	// tabla license
		// datos origen
		log.info("tabla license");
		List<License> licenseList = licenseServicePost.findAll();

		licenseList.stream().forEach(add -> mapeaLicense(add));
		if (licenseList.size() > 0)
			log.info("tabla license migrada OK");
		else
			log.info("tabla license vacia. Nada que migrar");

				// tabla logs
		// datos origen
		log.info("tabla logs");
		List<Logs> logsList = logsServicePost.findAll();

		logsList.stream().forEach(add -> mapeaLogs(add));
		if (logsList.size() > 0)
			log.info("tabla logs migrada OK");
		else
			log.info("tabla logs vacia. Nada que migrar");

		// tabla resource
		// datos origen
		log.info("tabla resource");
		List<Resource> resourceList = resourceServicePost.findAll();

		resourceList.stream().forEach(add -> mapeaResource(add));
		if (resourceList.size() > 0)
			log.info("tabla resource migrada OK");
		else
			log.info("tabla resource vacia. Nada que migrar");

		// tabla proresource
		// datos origen
		log.info("tabla propresource");
		List<PropResource> propresourceList = propResourceServicePost.findAll();

		propresourceList.stream().forEach(add -> mapeaPropResource(add));
		if (propresourceList.size() > 0)
			log.info("tabla propresource migrada OK");
		else
			log.info("tabla propresource vacia. Nada que migrar");

		// tabla resourceVector
		// datos origen
		log.info("tabla resourceVector");
		List<ResourceVector> resourceVectorList = resourceVectorServicePost.findAll();

		resourceVectorList.stream().forEach(add -> mapeaResourceVector(add));
		if (resourceVectorList.size() > 0)
			log.info("tabla resourceVector migrada OK");
		else
			log.info("tabla resourceVector vacia. Nada que migrar");

		// tabla resourceCalendar
		// datos origen
		log.info("tabla resourceCalendar");
		List<ResourceCalendar> resourceCalendarList = resourceCalendarServicePost.findAll();

		resourceCalendarList.stream().forEach(add -> mapeaResourceCalendar(add));
		if (resourceCalendarList.size() > 0)
			log.info("tabla resourceCalendar migrada OK");
		else
			log.info("tabla resourceCalendar vacia. Nada que migrar");

		// tabla rules
		// datos origen
		log.info("tabla rules");
		List<Rules> rulesList = rulesServicePost.findAll();

		rulesList.stream().forEach(add -> mapeaRules(add));
		if (rulesList.size() > 0)
			log.info("tabla rules migrada OK");
		else
			log.info("tabla rules vacia. Nada que migrar");

		// tabla rulesCal
		// datos origen
		log.info("tabla rulesCal");
		List<RruleCal> rulesCalList = rulesCalServicePost.findAll();

		rulesCalList.stream().forEach(add -> mapeaRulesCal(add));
		if (rulesCalList.size() > 0)
			log.info("tabla rulesCal migrada OK");
		else
			log.info("tabla rulesCal vacia. Nada que migrar");

		// tabla rulesCmp
		// datos origen
		log.info("tabla rulesCmp");
		List<RruleCmp> rulesCmpList = rulesCmpServicePost.findAll();

		rulesCmpList.stream().forEach(add -> mapeaRulesCmp(add));
		if (rulesCmpList.size() > 0)
			log.info("tabla rulesCmp migrada OK");
		else
			log.info("tabla rulesCmp vacia. Nada que migrar");

		// tabla rulesDn
		// datos origen
		log.info("tabla rulesDn");
		List<RruleDn> rulesDnList = rulesDnServicePost.findAll();

		rulesDnList.stream().forEach(add -> mapeaRulesDn(add));

		if (rulesDnList.size() > 0)
			log.info("tabla rulesDn migrada OK");
		else
			log.info("tabla rulesDn vacia. Nada que migrar");

		// tabla rulesVec
		// datos origen
		log.info("tabla rulesVec");
		List<RruleVec> rulesVecList = rulesVecServicePost.findAll();

		rulesVecList.stream().forEach(add -> mapeaRulesVec(add));
		if (rulesVecList.size() > 0)
			log.info("tabla rulesVec migrada OK");
		else
			log.info("tabla rulesVec vacia. Nada que migrar");

		// tabla Sites
		// datos origen
		log.info("tabla Sites");
		List<Sites> sitesList = sitesServicePost.findAll();

		sitesList.stream().forEach(add -> mapeaSites(add));
		if (sitesList.size() > 0)
			log.info("tabla Sites migrada OK");
		else
			log.info("tabla Sites vacia. Nada que migrar");

		// tabla Sysprops
		// datos origen
		log.info("tabla Sysprops");
		List<Sysprops> syspropsList = syspropsServicePost.findAll();

		syspropsList.stream().forEach(add -> mapeaSysprops(add));
		if (syspropsList.size() > 0)
			log.info("tabla Sysprops migrada OK");
		else
			log.info("tabla Sysprops vacia. Nada que migrar");

		// tabla Syspropcoll
		// datos origen
		log.info("tabla Syspropcoll");
		List<Syspropcoll> syspropcollList = syspropcollServicePost.findAll();

		syspropcollList.stream().forEach(add -> mapeaSyspropcoll(add));
		if (syspropcollList.size() > 0)
			log.info("tabla Syspropcoll migrada OK");
		else
			log.info("tabla Syspropcoll vacia. Nada que migrar");

		// tabla UsrDns
		// datos origen
				log.info("tabla UsrDns");
		List<UsrDns> usrDnsList = usrDnsServicePost.findAll();

		usrDnsList.stream().forEach(add -> mapeaUsrDns(add));
		if (usrDnsList.size() > 0)
			log.info("tabla UsrDns migrada OK");
		else
			log.info("tabla UsrDns vacia. Nada que migrar");

		// tabla UsrTeam
		// datos origen
		log.info("tabla UsrTeam");
		List<UsrTeam> usrTeamList = usrTeamServicePost.findAll();

		usrTeamList.stream().forEach(add -> mapeaUsrTeam(add));
		if (usrTeamList.size() > 0)
			log.info("tabla UsrTeam migrada OK");
		else
			log.info("tabla UsrTeam vacia. Nada que migrar");

	}
	private void mapeaUsrTeam(UsrTeam usrTeam) {
		cestel.sercom.maria.entity.UsrTeam usrTeamMaria = new cestel.sercom.maria.entity.UsrTeam();

		usrTeamMaria.setResid(usrTeam.getRes_id());
		usrTeamMaria.setUserid(usrTeam.getUser_id());

		log.debug(usrTeamMaria.toString());

		usrTeamServiceMaria.save(usrTeamMaria);
	}

	private void mapeaUsrDns(UsrDns usrDns) {
		cestel.sercom.maria.entity.UsrDns usrDnsMaria = new cestel.sercom.maria.entity.UsrDns();

		usrDnsMaria.setDnid(usrDns.getDn_id());
		usrDnsMaria.setUserid(usrDns.getUser_id());

		log.debug(usrDnsMaria.toString());

		usrDnsServiceMaria.save(usrDnsMaria);
	}

	private void mapeaSyspropcoll(Syspropcoll syspropcoll) {
		cestel.sercom.maria.entity.Syspropcoll syspropcollMaria = new cestel.sercom.maria.entity.Syspropcoll();

		syspropcollMaria.setId(syspropcoll.getSysprop_id());
		syspropcollMaria.setName(syspropcoll.getName());

		log.debug(syspropcollMaria.toString());

		syspropcollServiceMaria.save(syspropcollMaria);
	}

	private void mapeaSysprops(Sysprops sysprops) {
		cestel.sercom.maria.entity.Sysprops syspropsMaria = new cestel.sercom.maria.entity.Sysprops();

		syspropsMaria.setSyspropcollid(sysprops.getSysprop_id());
		syspropsMaria.setValue(sysprops.getValue());
		syspropsMaria.setName(sysprops.getName());

		log.debug(syspropsMaria.toString());

		syspropsServiceMaria.save(syspropsMaria);
	}

	private void mapeaSites(Sites sites) {
		cestel.sercom.maria.entity.Sites sitesMaria = new cestel.sercom.maria.entity.Sites();

		sitesMaria.setId(sites.getSite_id());
		sitesMaria.setInfo(sites.getInfo());
		sitesMaria.setName(sites.getName());

		log.debug(sitesMaria.toString());

		sitesServiceMaria.save(sitesMaria);
	}

	private void mapeaRulesVec(RruleVec rules) {
		cestel.sercom.maria.entity.RruleVec rulesMaria = new cestel.sercom.maria.entity.RruleVec();

		rulesMaria.setResid(rules.getRes_id());
		rulesMaria.setRruleid(rules.getRrule_id());

		log.debug(rulesMaria.toString());

		rulesVecServiceMaria.save(rulesMaria);
	}

	private void mapeaRulesDn(RruleDn rules) {
		cestel.sercom.maria.entity.RruleDn rulesMaria = new cestel.sercom.maria.entity.RruleDn();

		rulesMaria.setDnid(rules.getDn_id());
		rulesMaria.setRruleid(rules.getRrule_id());

		log.debug(rulesMaria.toString());

		rulesDnServiceMaria.save(rulesMaria);
	}

	private void mapeaRulesCmp(RruleCmp rules) {
		cestel.sercom.maria.entity.RruleCmp rulesMaria = new cestel.sercom.maria.entity.RruleCmp();

		rulesMaria.setRruleid(rules.getRrule_id());
		rulesMaria.setResid(rules.getRes_id());

		log.debug(rulesMaria.toString());

		rulesCmpServiceMaria.save(rulesMaria);
	}

	private void mapeaRulesCal(RruleCal rules) {
		cestel.sercom.maria.entity.RruleCal rulesMaria = new cestel.sercom.maria.entity.RruleCal();

		rulesMaria.setRruleid(rules.getRrule_id());
		rulesMaria.setResid(rules.getRes_id());

		log.debug(rulesMaria.toString());

		rulesCalServiceMaria.save(rulesMaria);
	}

	private void mapeaRules(Rules rules) {
		cestel.sercom.maria.entity.Rules rulesMaria = new cestel.sercom.maria.entity.Rules();
		rulesMaria.setId(rules.getRrule_id());
		rulesMaria.setName(rules.getName());
		rulesMaria.setMediacode(rules.getMediacode());
		rulesMaria.setAccessprefix(rules.getAccessprefix());
		rulesMaria.setAccesssuffix(rules.getAccesssuffix());
		rulesMaria.setKeepaccessprefix(rules.isKeepaccessprefix());
		rulesMaria.setKeepaccesssuffix(rules.isKeepaccesssuffix());
		rulesMaria.setKeepcampaign(rules.isKeepcampaign());
		rulesMaria.setExtraprefix(rules.getExtraprefix());
		rulesMaria.setExtrasuffix(rules.getExtrasuffix());
		rulesMaria.setIntervalo(rules.getInterval());
		rulesMaria.setEnabled(rules.isEnabled());
		rulesMaria.setAccessregex(rules.getAccessregex());
		rulesMaria.setDomid(rules.getDom_id());
		rulesMaria.setNodeid(rules.getNode_id());

		log.debug(rulesMaria.toString());

		rulesServiceMaria.save(rulesMaria);
	}

	private void mapeaResourceCalendar(ResourceCalendar resourceCalendar) {
		cestel.sercom.maria.entity.ResourceCalendar resourceCalendarMaria = new cestel.sercom.maria.entity.ResourceCalendar();
		resourceCalendarMaria.setResid(resourceCalendar.getRes_id());
		resourceCalendarMaria.setXmldata(resourceCalendar.getXml_data());

		log.debug(resourceCalendarMaria.toString());

		resourceCalendarServiceMaria.save(resourceCalendarMaria);
	}

	private void mapeaResourceVector(ResourceVector resourceVector) {
		cestel.sercom.maria.entity.ResourceVector resourceVectorMaria = new cestel.sercom.maria.entity.ResourceVector();
		resourceVectorMaria.setResid(resourceVector.getRes_id());
		resourceVectorMaria.setXmldata(resourceVector.getXml_data());

		log.debug(resourceVectorMaria.toString());

		resourceVectorServiceMaria.save(resourceVectorMaria);
	}

	private void mapeaPropResource(PropResource propresource) {
		cestel.sercom.maria.entity.PropResource propResourceMaria = new cestel.sercom.maria.entity.PropResource();
		propResourceMaria.setResid(propresource.getRes_id());
		propResourceMaria.setName(propresource.getName());
		propResourceMaria.setValue(propresource.getValue());

		log.debug(propResourceMaria.toString());

		propResourceServiceMaria.save(propResourceMaria);
	}

	private void mapeaResource(Resource resource) {
		cestel.sercom.maria.entity.Resource resourceMaria = new cestel.sercom.maria.entity.Resource();
		resourceMaria.setId(resource.getRes_id());
		resourceMaria.setResclass(resource.getRes_class());
		resourceMaria.setName(resource.getName());
		resourceMaria.setInfo(resource.getInfo());
		resourceMaria.setSubdomid(resource.getSubdom_id());
		resourceMaria.setNodeid(resource.getNode_id());

		log.debug(resourceMaria.toString());

		resourceServiceMaria.save(resourceMaria);
	}

	private void mapeaLogs(Logs logs) {
		cestel.sercom.maria.entity.Logs logsMaria = new cestel.sercom.maria.entity.Logs();
		logsMaria.setId(logs.getLog_id());
		logsMaria.setSeverity(logs.getSeverity());
		logsMaria.setSource(logs.getSource());
		logsMaria.setMsg(logs.getMsg());
		logsMaria.setCreation(logs.getCreation());

		log.debug(logsMaria.toString());

		logsServiceMaria.save(logsMaria);
	}

	private void mapeaLicense(License license) {
		cestel.sercom.maria.entity.License licenseMaria = new cestel.sercom.maria.entity.License();
		licenseMaria.setId(license.getLic_id());
		licenseMaria.setName(license.getName());
		licenseMaria.setQuantity(license.getQuantity());
		licenseMaria.setExpirationdate(license.getExpirationdate());
		licenseMaria.setClave(license.getKeys());
		licenseMaria.setDomid(license.getDom_id());
		licenseMaria.setNodeid(license.getNode_id());

		log.debug(licenseMaria.toString());

		licenseServiceMaria.save(licenseMaria);
	}

	private void mapeaDnDevice(DnDevice dnDevice) {
		cestel.sercom.maria.entity.DnDevice dnDeviceMaria = new cestel.sercom.maria.entity.DnDevice();
		dnDeviceMaria.setDevid(dnDevice.getDev_id());
		dnDeviceMaria.setDnid(dnDevice.getDn_id());

		log.debug(dnDeviceMaria.toString());

		dnDeviceServiceMaria.save(dnDeviceMaria);
	}

	private void mapeaDns(Dns dns) {
		cestel.sercom.maria.entity.Dns dnsMaria = new cestel.sercom.maria.entity.Dns();
		dnsMaria.setId(dns.getDn_id());
		dnsMaria.setName(dns.getName());
		dnsMaria.setDntypecode(dns.getDntypecode());
		dnsMaria.setMediacode(dns.getMediacode());
		dnsMaria.setRemotepeer(dns.getRemotepeer());
		dnsMaria.setDomid(dns.getDom_id());
		dnsMaria.setNodeid(dns.getNode_id());

		log.debug(dnsMaria.toString());

		dnsServiceMaria.save(dnsMaria);
	}

	private void mapeaAnswers(Answers ans) {
		cestel.sercom.maria.entity.Answers answersMaria = new cestel.sercom.maria.entity.Answers();
		answersMaria.setId(ans.getId());
		answersMaria.setPhoneaddress(ans.getPhone_address());
		answersMaria.setResid(ans.getResource_id());
		answersMaria.setSubdomid(ans.getSubdom_id());

		log.debug(answersMaria.toString());

		answersServiceMaria.save(answersMaria);
	}

	private void mapeaAddinsProp(AddinsProp addProp) {
		cestel.sercom.maria.entity.AddinsProp addinsPropMaria = new cestel.sercom.maria.entity.AddinsProp();
		// addinsPropMaria.setId(addProp.getAddin_id());
		addinsPropMaria.setAddinsid(addProp.getAddin_id());
		addinsPropMaria.setValue(addProp.getValue());
		addinsPropMaria.setName(addProp.getName());

		log.debug(addinsPropMaria.toString());

		addinsPropServiceMaria.save(addinsPropMaria);
	}

	private void mapeaAddinsPlg(AddinsPlg addPlg) {
		cestel.sercom.maria.entity.AddinsPlg addinsPlgMaria = new cestel.sercom.maria.entity.AddinsPlg();
		addinsPlgMaria.setId(addPlg.getAddin_id());
		addinsPlgMaria.setPclass(addPlg.getP_class());

		log.debug(addinsPlgMaria.toString());

		addinsPlgServiceMaria.save(addinsPlgMaria);
	}

	private void mapeaAddinsDev(AddinsDev addDev) {
		cestel.sercom.maria.entity.AddinsDev addinsDevMaria = new cestel.sercom.maria.entity.AddinsDev();
		addinsDevMaria.setId(addDev.getAddin_id());
		addinsDevMaria.setName(addDev.getName());
		addinsDevMaria.setDevgroup(addDev.getDevgroup());
		addinsDevMaria.setMedia(addDev.getMedia());

		log.debug(addinsDevMaria.toString());

		addinsDevServiceMaria.save(addinsDevMaria);
	}

	private void mapeaAddins(Addins add) {
		cestel.sercom.maria.entity.Addins addinsMaria = new cestel.sercom.maria.entity.Addins();
		addinsMaria.setId(add.getAddin_id());
		addinsMaria.setFamily(add.getFamily());
		addinsMaria.setType(add.getType());
		addinsMaria.setAclass(add.getA_class());
		addinsMaria.setVersion(add.getVersion());
		addinsMaria.setNodeid(add.getNode_id());

		log.debug(addinsMaria.toString());

		addinsServiceMaria.save(addinsMaria);
	}

	/**
	 * 
	 */
	private void mapeaRoles() {
		for (int i = 1; i <= RolesEnum.size(); i++) {
			var res = RolesEnum.findByCode(i).get();
			// var k = res;

			cestel.sercom.maria.entity.Roles roles = new cestel.sercom.maria.entity.Roles();
			roles.setId(res.getId());
			roles.setNombre(res.toString());
			roles.setDescripcion(res.getDescripcion());
			roles.setDefinicion(res.getDefinicion());
			log.debug(roles.toString());
			rolesServiceMaria.save(roles);
		}
	}

	private void mapeaSubDominio(SubDomain subdom) {
		cestel.sercom.maria.entity.SubDomain subDominioMaria = new cestel.sercom.maria.entity.SubDomain();
		subDominioMaria.setId(subdom.getSubdom_id());
		subDominioMaria.setName(subdom.getName());
		subDominioMaria.setInfo(subdom.getInfo());
		subDominioMaria.setDom_id(subdom.getDom_id());
		subDominioMaria.setUtc(subdom.getUtc());

		log.debug(subDominioMaria.toString());

		subDomainServiceMaria.save(subDominioMaria);

	}

	private void mapeaDominio(Domain dom) {
		cestel.sercom.maria.entity.Domain dominioMaria = new cestel.sercom.maria.entity.Domain();
		dominioMaria.setId(dom.getDom_id());
		dominioMaria.setName(dom.getName());
		dominioMaria.setInfo(dom.getInfo());
		dominioMaria.setC_schema(dom.getSchema());
		dominioMaria.setUtc(dom.getUtc());

		log.debug(dominioMaria.toString());

		domainServiceMaria.save(dominioMaria);

	}

	private void mapeaUsuario(Users usu) {
		cestel.sercom.maria.entity.Users usuarioMaria = new cestel.sercom.maria.entity.Users();
		usuarioMaria.setId(usu.getUser_id());
		usuarioMaria.setName(usu.getName());
		usuarioMaria.setInfo(usu.getInfo());
		usuarioMaria.setDomid(usu.getDomid());
		usuarioMaria.setPassword(usu.getPwd());
		usuarioMaria.setProfilecode(usu.getProfilecode());

		usuarioMaria.setSubdomid(usu.getSubdomid());
		usuarioMaria.setUsername(usu.getLogin());

		log.debug(usuarioMaria.toString());

		usersServiceMaria.save(usuarioMaria);

	}

}
