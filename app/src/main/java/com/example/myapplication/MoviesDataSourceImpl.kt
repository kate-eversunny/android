package com.example.myapplication

class MoviesDataSourceImpl : MoviesDataSource {

	override fun loadMovies(): ArrayList<MovieDto> = arrayListOf(
		MovieDto(
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
			title = "Гнев человеческий",
			description = "Эйч — загадочный и холодный на вид джентльмен, но внутри него пылает жажда справедливости. Преследуя...",
			fullDescription = "Эйч — загадочный и холодный на вид джентльмен, но внутри него пылает жажда справедливости. Преследуя свои мотивы, он внедряется в инкассаторскую компанию, чтобы выйти на соучастников серии многомиллионных ограблений, потрясших Лос-Анджелес. В этой запутанной игре у каждого своя роль, но под подозрением оказываются все. Виновных же обязательно постигнет гнев человеческий.",
			rateScore = 5,
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
			title = "Мортал Комбат",
			description = "Боец смешанных единоборств Коул Янг не раз соглашался проиграть за деньги. Он не знает о своем наследии...",
			fullDescription = "Боец смешанных единоборств Коул Янг не раз соглашался проиграть за деньги. Он не знает о своем наследии и почему император Внешнего мира Шан Цзун посылает могущественного криомансера Саб-Зиро на охоту за Коулом. Янг боится за безопасность своей семьи, и майор спецназа Джакс, обладатель такой же отметки в виде дракона, как и у Коула, советует ему отправиться на поиски Сони Блейд. Вскоре Коул, Соня и наёмник Кано оказываются в храме Лорда Рейдена, Старшего Бога и защитника Земного царства, который дает убежище тем, кто носит метку. Здесь прибывшие тренируются с опытными воинами Лю Каном и Кун Лао, готовясь противостоять врагам из Внешнего мира, а для этого им нужно раскрыть в себе аркану — могущественную силу души.",
			rateScore = 1,
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
}

