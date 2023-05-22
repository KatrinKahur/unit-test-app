import '@testing-library/jest-dom';
import '@testing-library/user-event';
import {ErrorMessage} from "../../components/errorMessage";
import {cleanup, fireEvent, render, screen} from "@testing-library/react";

beforeEach(() => {
    cleanup();
})
describe('ErrorMessage', () => {
    it('should render correctly', () => {
        let showStatus = false;
        const setShow = (status) => {
            showStatus = status;
        }
        const testProps = {
            message: "Error message",
            show: true,
            setShow: setShow
        }

        const { asFragment } = render(<ErrorMessage {...testProps}/>)
        expect(asFragment()).toMatchSnapshot();
    });

    it('should appear when the show variable is set', () => {
        let showStatus = false;
        let errorMsg = "Error message";
        const setShow = (status) => {
            showStatus = status;
        }
        const testProps = {
            message: errorMsg,
            show: true,
            setShow: setShow
        }

        render(<ErrorMessage {...testProps} />)
        expect(screen.getByText(errorMsg)).toBeInTheDocument();

    });

    it('should not appear when the show variable is false', () => {
        let showStatus = false;
        let errorMsg = "Error message";
        const setShow = (status) => {
            showStatus = status;
        }
        const testProps = {
            message: errorMsg,
            show: false,
            setShow: setShow
        }
        render(<ErrorMessage {...testProps} />)
        expect(screen.queryByText(errorMsg)).toBeNull();
    });

    it('should disappear when pressed on', async () => {
        let showStatus = false;
        let errorMsg = "Error message";
        const setShow = (status) => {
            showStatus = status;
        }
        const testProps = {
            message: errorMsg,
            show: true,
            setShow: setShow
        }
        render(<ErrorMessage {...testProps} />)
        expect(screen.getByTestId('error-message')).toBeInTheDocument();

        await(async() => {
            fireEvent.click(screen.getByTestId('error-message'));
        })

        expect(screen.getByText(errorMsg)).toBeInTheDocument();

    })
})