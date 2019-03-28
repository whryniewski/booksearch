import { shallowMount } from '@vue/test-utils';
import BookSearch from '@/components/BookSearch'

describe('BookSearch.vue', () => {
  it('should render Search Button', () => {
    const wrapper = shallowMount(BookSearch);
    const contentButton = wrapper.find('button');
    expect(contentButton.text()).toEqual('Search for books');
  })
})
