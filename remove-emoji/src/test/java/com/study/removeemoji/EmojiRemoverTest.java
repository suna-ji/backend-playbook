package com.study.removeemoji;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class EmojiRemoverTest {

    @Test
    void 정규식1_이모지_테스트() {
        // given
        String test = "👨‍👩‍👧‍👦👩‍❤️‍💋‍👩👨‍❤️‍👨🧑‍⚕️🧑‍🎓🧑‍🍳🧑‍🏫🧑‍🏭🧑‍🚀🧑‍🔧🧑‍🦽🧑‍🦯👩‍🔬👨‍🔧🧗‍♀️🏋️‍♂️🚴‍♀️🤾‍♂️👨‍🦰👩‍🦳👨‍🦲👩‍🦱👨‍👩‍👧👩‍👩‍👦👍🏽👋🏻🙌🏿👏🏼🤚🏾🏳️‍🌈🏳️‍⚧️👨‍🎤👩‍🎨🧙‍♂️🧝‍♀️🧛‍♂️🧜‍♀️";
        // when
        String removedNonStandardCharacters = EmojiRemover.removeNonStandardCharacters(test);
        // then
        assertThat(removedNonStandardCharacters).isEqualTo("");
    }
    @Test
    void 정규식1_특수문자_숫자_테스트() {
        // given
        String test = "~!@#$%^&*()_+₩1234567890-=";
        // when
        String removedNonStandardCharacters = EmojiRemover.removeNonStandardCharacters(test);
        // then
        assertThat(removedNonStandardCharacters).isEqualTo("~!@#$%^&*()_+₩1234567890-=");
    }

    @Test
    void 정규식2_테스트() {
        // given
        String test = "👨‍👩‍👧‍👦👩‍❤️‍💋‍👩👨‍❤️‍👨🧑‍⚕️🧑‍🎓🧑‍🍳🧑‍🏫🧑‍🏭🧑‍🚀🧑‍🔧🧑‍🦽🧑‍🦯👩‍🔬👨‍🔧🧗‍♀️🏋️‍♂️🚴‍♀️🤾‍♂️👨‍🦰👩‍🦳👨‍🦲👩‍🦱👨‍👩‍👧👩‍👩‍👦👍🏽👋🏻🙌🏿👏🏼🤚🏾🏳️‍🌈🏳️‍⚧️👨‍🎤👩‍🎨🧙‍♂️🧝‍♀️🧛‍♂️🧜‍♀️";
        // when
        String removedOnlyEmojis = EmojiRemover.removeOnlyEmojis(test);
        // then
        assertThat(removedOnlyEmojis).isEqualTo("");
    }

    @Test
    void 정규식2_특수문자_숫자_테스트() {
        // given
        String test = "~!@#$%^&*()_+₩1234567890-=";
        // when
        String removedOnlyEmojis = EmojiRemover.removeOnlyEmojis(test);
        // then
        assertThat(removedOnlyEmojis).isEqualTo("~!@#$%^&*()_+₩1234567890-=");
    }
}