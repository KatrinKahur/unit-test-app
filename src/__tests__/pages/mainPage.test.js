import {render, screen} from "@testing-library/react";
import '@testing-library/jest-dom';
import user from '@testing-library/user-event';
import MainPage from "../../pages/mainPage";

describe('MainPage', () => {
    it('renders correctly', () => {
        const { asFragment } = render(<MainPage />);
        expect(asFragment()).toMatchSnapshot();
    });

    it('wrong file type triggers the error message', async () => {
        render(<MainPage/>);
        const fileContent = "some text"

        const file = new File([fileContent], 'test_file.java');
        File.prototype.text = jest.fn().mockResolvedValueOnce(fileContent);
        const input = screen.getByTestId("file-input");
        user.upload(input, file);

    })
})