package com.example.myapplication.model

class MoviesDataSourceImpl : MoviesDataSource {

	override fun loadMovies(): ArrayList<MovieDto> = arrayListOf(
		MovieDto(
			id = 1,
			title = "Гнев человеческий",
			description = "Эйч — загадочный и холодный на вид джентльмен, но внутри него пылает жажда справедливости. Преследуя...",
			fullDescription = "Эйч — загадочный и холодный на вид джентльмен, но внутри него пылает жажда справедливости. Преследуя свои мотивы, он внедряется в инкассаторскую компанию, чтобы выйти на соучастников серии многомиллионных ограблений, потрясших Лос-Анджелес. В этой запутанной игре у каждого своя роль, но под подозрением оказываются все. Виновных же обязательно постигнет гнев человеческий.",
			rateScore = 3,
			ageRestriction = 18,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5JP9X5tCZ6qz7DYMabLmrQirlWh.jpg",
			release = "22.04.2021",
			genre = "боевики",
			actors = arrayOf(
				ActorDto(
					name = "Джейсон Стэйтем",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/5c6d81b5-d31c-4389-89d0-4b554b82b68b/280x420",
				),
				ActorDto(
					name = "Холт Маккэллани",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/f3e51e20-f760-422a-8bda-82c9d8cd9c4a/280x420"
				),
				ActorDto(
					name = "Джош Хартнетт",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/51752849-9afa-484e-9b09-61eafae6401e/280x420"
				),
			),
		),
		MovieDto(
			id = 2,
			title = "Мортал Комбат",
			description = "Боец смешанных единоборств Коул Янг не раз соглашался проиграть за деньги. Он не знает о своем наследии...",
			fullDescription = "Боец смешанных единоборств Коул Янг не раз соглашался проиграть за деньги. Он не знает о своем наследии и почему император Внешнего мира Шан Цзун посылает могущественного криомансера Саб-Зиро на охоту за Коулом. Янг боится за безопасность своей семьи, и майор спецназа Джакс, обладатель такой же отметки в виде дракона, как и у Коула, советует ему отправиться на поиски Сони Блейд. Вскоре Коул, Соня и наёмник Кано оказываются в храме Лорда Рейдена, Старшего Бога и защитника Земного царства, который дает убежище тем, кто носит метку. Здесь прибывшие тренируются с опытными воинами Лю Каном и Кун Лао, готовясь противостоять врагам из Внешнего мира, а для этого им нужно раскрыть в себе аркану — могущественную силу души.",
			rateScore = 5,
			ageRestriction = 18,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pMIixvHwsD5RZxbvgsDSNkpKy0R.jpg",
			release = "08.04.2021",
			genre = "боевики",
			actors = arrayOf(
				ActorDto(
					name = "Льюис Тан",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/9f406299-77c7-4995-b7db-32e9c583bdc6/280x420",
				),
				ActorDto(
					name = "Джо Таслим",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/8ae91308-2e72-4c6d-9572-f39ea159658e/280x420"
				),
				ActorDto(
					name = "Джессика МакНэми",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/d2f5d264-114c-4d3c-b30c-88e49cf3005f/280x420"
				),
			),
		),
		MovieDto(
			id = 3,
			title = "Упс... Приплыли!",
			description = "От Великого потопа зверей спас ковчег. Но спустя полгода скитаний они готовы сбежать с него куда угодно...",
			fullDescription = "От Великого потопа зверей спас ковчег. Но спустя полгода скитаний они готовы сбежать с него куда угодно. Нервы на пределе. Хищники готовы забыть про запреты и заглядываются на травоядных. Единственное спасение — найти райский остров. Там простор и полно еды. Но даже если он совсем близко, будут ли рады местные такому количеству гостей?",
			rateScore = 5,
			ageRestriction = 6,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/546RNYy9Wi5wgboQ7EtD6i0DY5D.jpg",
			release = "29.04.2021",
			genre = "детские",
			actors = arrayOf(
				ActorDto(
					name = "Дермот Магеннис",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/3c4ac913-2bd6-490c-9cbb-a5bd3b5cddfc/280x420",
				),
				ActorDto(
					name = "Тара Флинн",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/4d77ed9a-a4c3-4965-9ac4-a64de322a27e/280x420"
				),
				ActorDto(
					name = "Мэри Мюррей",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/19258aed-a52f-4b81-a5db-191d049c8db5/280x420"
				),
			),

		),
		MovieDto(
			id = 4,
			title = "The Box",
			description = "Уличный музыкант знакомится с музыкальным продюсером, и они вдвоём отправляются в путешествие...",
			fullDescription = "Уличный музыкант знакомится с музыкальным продюсером, и они вдвоём отправляются в путешествие, которое перевернёт их жизни.",
			rateScore = 4,
			ageRestriction = 12,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fq3DSw74fAodrbLiSv0BW1Ya4Ae.jpg",
			release = "13.05.2021",
			genre = "мюзиклы",
			actors = arrayOf(
				ActorDto(
					name = "Пак Чхан-ёль",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/3e3139c9-a404-4e80-86e4-a7767f27b5dd/280x420",
				),
				ActorDto(
					name = "Чо Даль-хван",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/bc65f999-b4f6-4469-9602-ead998d6cb46/280x420"
				),
				ActorDto(
					name = "Ким Джи-хён",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/69a20613-fc51-4129-935d-29a35eb671a5/280x420"
				),
			),
		),
		MovieDto(
			id = 5,
			title = "Сага о Дэнни Эрнандесе",
			description = "Tekashi69 или Сикснайн — знаменитый бруклинский рэпер с радужными волосами — прогремел...",
			fullDescription = "Tekashi69 или Сикснайн — знаменитый бруклинский рэпер с радужными волосами — прогремел синглом «Gummo», коллабом с Ники Минаж, а также многочисленными преступлениями. Количество обвинений растет пропорционально интернет-популярности, а репутация секс-наркомана получает свое подтверждение не только в скандальных видео музыканта. Похоже, это последний герой нашего времени, которого не коснулась культура отмены: у Tekashi69 24 млн. подписчиков в Instagram, миллиард просмотров на Youtube и несколько судимостей.",
			rateScore = 2,
			ageRestriction = 18,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5xXGQLVtTAExHY92DHD9ewGmKxf.jpg",
			release = "16.11.2020",
			genre = "документальные",
			actors = arrayOf(
				ActorDto(
					name = "6ix9ine",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/54167000-7218-4d11-b70a-8988f243af5f/280x420",
				),
			),
		),
		MovieDto(
			id = 6,
			title = "Пчелка Майя",
			description = "Когда упрямая пчелка Майя и ее лучший друг Вилли спасают принцессу-муравьишку, начинается сказочное...",
			fullDescription = "Когда упрямая пчелка Майя и ее лучший друг Вилли спасают принцессу-муравьишку, начинается сказочное и опасное приключение, которое приведет их в необычные новые миры и проверит их дружбу на прочность.",
			rateScore = 4,
			ageRestriction = 0,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xltjMeLlxywym14NEizl0metO10.jpg",
			release = "06.05.2021",
			genre = "мультфильмы",
			actors = arrayOf(
				ActorDto(
					name = "Коко Джек Гиллис",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/a3f3ad44-69a4-4ee9-99ed-f207638a1b8d/280x420",
				),
				ActorDto(
					name = "Бенсон Джек Энтони",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/9fd32e27-0815-4d77-b8ee-a2ea02971ca0/280x420"
				),
				ActorDto(
					name = "Кристофер Карисиу",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/48777755-c0c8-467f-a0ab-d72d646f1a28/280x420"
				),
			),
		),
		MovieDto(
			id = 7,
			title = "Круэлла",
			description = "Невероятно одаренная мошенница по имени Эстелла решает сделать себе имя в мире моды.",
			fullDescription = "Невероятно одаренная мошенница по имени Эстелла решает сделать себе имя в мире моды. Ее лучшие друзья — парочка юных карманников, которые ценят страсть Эстеллы к приключениям и надеются вместе с ней отвоевать себе место под солнцем на улицах британской столицы. В один прекрасный день модное чутье Эстеллы привлекает внимание шикарной и пугающе высокомерной баронессы фон Хельман.",
			rateScore = 4,
			ageRestriction = 12,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hUfyYGP9Xf6cHF9y44JXJV3NxZM.jpg",
			release = "03.06.2021",
			genre = "комедии",
			actors = arrayOf(
				ActorDto(
					name = "Эмма Стоун",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1900788/1c629b89-4d69-4ec0-a050-c3aa5721477b/280x420",
				),
				ActorDto(
					name = "Эмма Томпсон",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/1db012e7-4e46-4885-b7c0-b6920275dca4/280x420"
				),
				ActorDto(
					name = "Джоэль Фрай",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/becab811-6925-4806-81c0-cc7686985ed1/280x420"
				),
				ActorDto(
					name = "Пол Уолтер Хаузер",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/f9589fa9-03a8-4808-bb1f-0a363842488d/280x420"
				),
			),
		),
		MovieDto(
			id = 8,
			title = "Чёрная вдова",
			description = "Чёрной Вдове придется вспомнить о том, что было в её жизни задолго до присоединения к команде Мстителей",
			fullDescription = "Чёрной Вдове придется вспомнить о том, что было в её жизни задолго до присоединения к команде Мстителей, и узнать об опасном заговоре, в который оказываются втянуты её старые знакомые - Елена (в исполнении Флоренс Пью), Алексей, также известный как Красный Страж (в исполнении Дэвида Харбора), и Мелина (в исполнении Рэйчел Вайс).",
			rateScore = 3,
			ageRestriction = 16,
			imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mbtN6V6y5kdawvAkzqN4ohi576a.jpg",
			release = "08.07.2021",
			genre = "фантастика",
			actors = arrayOf(
				ActorDto(
					name = "Скарлетт Йоханссон",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/a2d7d36f-2be8-4c5d-9892-0adc2437da5d/280x420",
				),
				ActorDto(
					name = "Флоренс Пью",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/aed40aa0-fac3-41a0-acc0-35344a7b6059/280x420"
				),
				ActorDto(
					name = "Дэвид Харбор",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/a66f9ce1-5b06-443c-8670-74bbb45f1185/280x420"
				),
			),
		),
	)

	override fun updateMovies(): ArrayList<MovieDto> = arrayListOf(
		MovieDto(
			id = 9,
			title = "Лига справедливости Зака Снайдера",
			description = "Вдохновившись самопожертвованием Супермена, Брюс Уэйн вновь обретает веру в человечество. Он...",
			fullDescription = "Вдохновившись самопожертвованием Супермена, Брюс Уэйн вновь обретает веру в человечество. Он заручается поддержкой новой союзницы Дианы Принс, чтобы сразиться с ещё более могущественным противником. Бэтмен и Чудо-женщина набирают команду сверхлюдей для борьбы с пробудившейся угрозой.",
			rateScore = 5,
			ageRestriction = 18,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/f252f87d-49be-4ca9-afe3-22ae0e2a6529/800x800",
			release = "18.03.2021",
			genre = "фантастика",
			actors = arrayOf(
				ActorDto(
					name = "Бен Аффлек",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/dbb7f246-d87c-43dc-97e3-30059dd7596f/280x420",
				),
				ActorDto(
					name = "Галь Гадот",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/42f3e662-b016-48aa-b62c-0fc651833997/280x420"
				),
				ActorDto(
					name = "Генри Кавилл",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/01084bcd-9d4f-4d29-93e1-80d819b0d7d1/280x420"
				),
			),
		),
		MovieDto(
			id = 10,
			title = "Майор Гром: Чумной доктор",
			description = "Майор полиции Игорь Гром известен всему Санкт-Петербургу пробивным характером и непримиримой...",
			fullDescription = "Майор полиции Игорь Гром известен всему Санкт-Петербургу пробивным характером и непримиримой позицией по отношению к преступникам всех мастей. Неимоверная сила, аналитический склад ума и неподкупность — всё это делает майора Грома идеальным полицейским. Но всё резко меняется с появлением человека в маске Чумного Доктора. Заявив, что его город «болен чумой беззакония», он принимается за «лечение», убивая людей, которые в своё время избежали наказания при помощи денег и влияния.",
			rateScore = 4,
			ageRestriction = 12,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/11e62a7e-6fc8-44a1-958d-3bf9c6fceb32/960x960",
			release = "01.04.2021",
			genre = "боевики",
			actors = arrayOf(
				ActorDto(
					name = "Тихон Жизневский",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/d42fd1e5-5d93-4cb8-ac66-945c6b9669cf/280x420",
				),
				ActorDto(
					name = "Любовь Аксенова",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/55e31c38-272f-4ad9-a2bb-5ac29efdd9af/280x420"
				),
				ActorDto(
					name = "Алексей Маклаков",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/13d2ead2-3874-42ca-92e7-d4f6034d9e7a/280x420"
				),
			),
		),
		MovieDto(
			id = 11,
			title = "Райя и последний дракон",
			description = "Давным-давно в волшебной стране Кумандре бок о бок с людьми жили драконы — создатели и хранители...",
			fullDescription = "Давным-давно в волшебной стране Кумандре бок о бок с людьми жили драконы — создатели и хранители воды. Мирной жизни пришел конец, когда появились друуны. Порождения тьмы обращали людей и драконов в каменные изваяния, и только магия драконихи Сису смогла прогнать злых созданий и расколдовать людей, но на драконов не подействовала. Кумандра раскололась на государства Сердца, Клыка, Когтя, Хребта и Хвоста, а волшебный драконий камень хранился в стране Сердца, которой правил отец Райи. Он мечтал объединить земли, но из-за человеческой жадности и зависти артефакт раскололся. Правитель каждой страны заполучил по осколку, а друуны снова стали властвовать безраздельно.",
			rateScore = 5,
			ageRestriction = 6,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/7174f208-ae31-4a7d-9c68-23634f169dd7/300x450",
			release = "04.03.2021",
			genre = "мультфильмы",
			actors = arrayOf(
				ActorDto(
					name = "Келли Мари Трэн",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/d408255d-b321-44ed-803e-e529883b2e3f/280x420",
				),
				ActorDto(
					name = "Аквафина",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/ccaa0be2-1a89-4fcb-ae4d-ac726ed8ed11/280x420"
				),
				ActorDto(
					name = "Джемма Чан",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/517c9f7c-9b38-4b43-a1f9-9587f232808b/280x420"
				),
			),

			),
		MovieDto(
			id = 12,
			title = "Никто",
			description = "Непримечательный и незаметный семьянин Хатч живёт скучной жизнью обычного аудитора, пока однажды...",
			fullDescription = "Непримечательный и незаметный семьянин Хатч живёт скучной жизнью обычного аудитора, пока однажды в его дом не вламываются грабители. И это бы сошло им с рук, если бы они не забрали браслетик его маленькой дочки. Не в силах это терпеть, Хатч отправляется на поиски наглецов, а на обратном пути ввязывается в драку с пьяными хулиганами, пристававшими к девушке в общественном транспорте. От души помахав кулаками, наш аудитор отправляет дебоширов в больницу, но оказывается, что один из пострадавших — брат влиятельного русского бандита. И он теперь жаждет мести.",
			rateScore = 4,
			ageRestriction = 18,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/a74d86f6-a78a-46dd-8c1e-65cd79984902/300x450",
			release = "18.03.2021",
			genre = "боевики",
			actors = arrayOf(
				ActorDto(
					name = "Боб Оденкёрк",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/0f64539d-b236-4e01-8791-f19233705c59/280x420",
				),
				ActorDto(
					name = "Алексей Серебряков",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/d1c1c977-3069-4211-94d4-5d05f0d1cb71/220x330"
				),
				ActorDto(
					name = "Кристофер Ллойд",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1900788/7d61330c-de65-4b60-a225-03ce35269c30/280x420"
				),
			),
		),
		MovieDto(
			id = 13,
			title = "Годзилла против Конга",
			description = "Конг и группа ученых отправляются в опасное путешествие в поисках родного дома гиганта...",
			fullDescription = "Конг и группа ученых отправляются в опасное путешествие в поисках родного дома гиганта. Среди них девочка Джия, единственная, кто умеет общаться с Конгом. Неожиданно они сталкиваются с разъяренным Годзиллой, разрушающим все на своем пути. Битва двух титанов, спровоцированная неведомыми силами — лишь малая часть тайны, спрятанной в недрах Земли.",
			rateScore = 2,
			ageRestriction = 12,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/90ea3980-eb3c-4a3d-8128-05d5716c11d2/300x450",
			release = "25.03.2020",
			genre = "фантастика",
			actors = arrayOf(
				ActorDto(
					name = "Александр Скарсгард",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4486454/ff4d011d-1024-43d1-b139-ee82801e7233/280x420",
				),
				ActorDto(
					name = "Милли Бобби Браун",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/7adfcecd-f3f3-41ce-8de0-391850ac675e/280x420",
				),
				ActorDto(
					name = "Ребекка Холл",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/4cce5cc9-fd44-4da4-88f0-3ca51986ed48/280x420",
				),
			),
		),
		MovieDto(
			id = 14,
			title = "Тихое место 2",
			description = "474 дня прошло после нападения на Землю охотящихся на звук существ, семья Эбботт продолжает бороться...",
			fullDescription = "474 дня прошло после нападения на Землю охотящихся на звук существ, семья Эбботт продолжает бороться за жизнь в полной тишине. Столкнувшись со смертельной угрозой в собственном доме, они вынуждены отправиться во внешний мир, где находят убежище и старого знакомого семьи. Поймав радиосигнал, Реган вычисляет место предполагаемой колонии выживших и решает во что бы то ни стало её разыскать.",
			rateScore = 3,
			ageRestriction = 12,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/1baf9b8b-9476-4698-a42f-2a76a5779ce0/300x450",
			release = "03.06.2021",
			genre = "ужасы",
			actors = arrayOf(
				ActorDto(
					name = "Эмили Блант",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/6c2b1c0e-0ecb-4453-aa14-0d1cd4b09448/280x420",
				),
				ActorDto(
					name = "Миллисент Симмондс",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/1ad27a48-5def-4a15-9225-bc1e7715abb7/280x420"
				),
				ActorDto(
					name = "Киллиан Мёрфи",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/60c9b049-6177-463f-b518-40337fbeb681/280x420"
				),
			),
		),
		MovieDto(
			id = 15,
			title = "Лука",
			description = "Незабываемые каникулы, в которых есть место и домашней пасте, и мороженому, и...",
			fullDescription = "Незабываемые каникулы, в которых есть место и домашней пасте, и мороженому, и бесконечным поездкам на мопеде, мальчик по имени Лука проводит в красивом приморском городке, расположенном на итальянской Ривьере. Ни одно приключение Луки не обходится без участия его нового лучшего друга, и беззаботность отдыха омрачает только лишь тот факт, что на самом деле в облике мальчика скрывается морской монстр из глубин лагуны, на берегу которой стоит городок.",
			rateScore = 5,
			ageRestriction = 6,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/731b0f02-1a1f-415b-aa69-67783f140be0/960x960",
			release = "17.06.2021",
			genre = "мультфильмы",
			actors = arrayOf(
				ActorDto(
					name = "Джейкоб Тремблей",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4716873/664c3261-9242-4c3a-9c53-80950ebe609c/280x420",
				),
				ActorDto(
					name = "Джек Дилан Грейзер",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/980d3eeb-eeac-4e7e-a551-289baf4081b6/280x420"
				),
				ActorDto(
					name = "Майя Рудольф",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/d9ca42a5-ece1-4712-ad5e-5432a3dfb490/280x420"
				),
			),
		),
		MovieDto(
			id = 16,
			title = "Время",
			description = "Семья отправляется в отпуск на тропический остров. Отдохнув всего пару часов на уединенном пляже, они обнаруживают...",
			fullDescription = "Семья отправляется в отпуск на тропический остров. Отдохнув всего пару часов на уединенном пляже, они обнаруживают, что повзрослели на несколько лет, а вся жизнь теперь — это один день.",
			rateScore = 3,
			ageRestriction = 16,
			imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/a2f5c334-8266-4d8d-b211-cd25ca9f0921/800x800",
			release = "22.07.2021",
			genre = "триллеры",
			actors = arrayOf(
				ActorDto(
					name = "Гаэль Гарсиа Берналь",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/798a0516-857d-490f-9b5b-5a4747c8981f/280x420",
				),
				ActorDto(
					name = "Вики Крипс",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/392c0a2f-28d6-4670-b712-0459a91622f7/280x420"
				),
				ActorDto(
					name = "Ники Амука-Бёрд",
					imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/e59b8c5e-c25b-4b2b-b5f7-ff78b1212a96/280x420"
				),
			),
		),
	)
}

